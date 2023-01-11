package com.itwill.tmr_house.cart.ui.김혜지;

import java.awt.Dimension;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.itwill.tmr_house.cart.Cart;
import com.itwill.tmr_house.cart.CartService;
import com.itwill.tmr_house.member.Member;
import com.itwill.tmr_house.member.MemberService;
import com.itwill.tmr_house.order.OrdersService;
import com.itwill.tmr_house.product.ProductService;


public class CartListPanel_test extends JPanel {
	
	/******Service 객체 멤버 변수 선언******/
	private ProductService productService;
	private MemberService memberService;
	private CartService cartService;
	private OrdersService ordersService;
	/***************************************/
	private Member loginMember = null;
	
	
	
	private JScrollPane cartContentPanelScrollPane;
	private JPanel cartContentPanel;
	private JLabel productImageLB;
	private JComboBox cartItemQtyCB;
	private JLabel productTitleLB;
	private JButton cartItemDeleteBTN_1;

	/**
	 * Create the panel.
	 */
	public CartListPanel_test() throws Exception {
		setLayout(null);
		
		cartContentPanelScrollPane = new JScrollPane();
		cartContentPanelScrollPane.setBounds(20, 100, 460, 450);
		add(cartContentPanelScrollPane);
		
		cartContentPanel = new JPanel();
		cartContentPanel.setPreferredSize(new Dimension(10, 700));
		cartContentPanelScrollPane.setViewportView(cartContentPanel);
		
		/*******************카트 패널 시작*****************/
		JPanel cartItemPanel = new JPanel();
		cartItemPanel.setPreferredSize(new Dimension(420, 120));
		cartContentPanel.add(cartItemPanel);
		cartItemPanel.setLayout(null);
		
		productImageLB = new JLabel("");
		productImageLB.setIcon(new ImageIcon(CartListPanel_test.class.getResource("/com/itwill/tmr_house/product/김혜지/images/chair_rattan_wood.png")));
		productImageLB.setBounds(40, 20, 80, 80);
		cartItemPanel.add(productImageLB);
		
		productTitleLB = new JLabel("상품 가격");
		productTitleLB.setBounds(132, 50, 100, 25);
		cartItemPanel.add(productTitleLB);
		
		cartItemQtyCB = new JComboBox();
		cartItemQtyCB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		cartItemQtyCB.setBounds(210, 50, 50, 25);
		cartItemPanel.add(cartItemQtyCB);
		
		cartItemDeleteBTN_1 = new JButton("삭제");
		cartItemDeleteBTN_1.setBounds(343, 51, 65, 23);
		cartItemPanel.add(cartItemDeleteBTN_1);
		
		JButton orderSelectedBTN = new JButton("선택 상품 주문");
		orderSelectedBTN.setBounds(52, 621, 150, 25);
		add(orderSelectedBTN);
		
		JButton orderAllBTN = new JButton("New button");
		orderAllBTN.setBounds(297, 621, 150, 25);
		add(orderAllBTN);
		/****************카트 패널 끝*****************/
		
		
		/**************Service 객체 멤버 변수 초기화****************/
		productService = new ProductService();
		memberService = new MemberService();
		cartService = new CartService();
		ordersService = new OrdersService();
		
		loginMember = new Member("aaaa", null, null, null, null, null);
		displayCartList();
		

	}/**생성자 끝*/
	
	
	public void displayCartList() throws Exception {
		
		cartContentPanel.removeAll();
		List<Cart> cartList = cartService.findCartItemByUserId(loginMember.getM_id());
		for(Cart cart : cartList) {
			
			JPanel cartItemPanel = new JPanel();
			cartItemPanel.setPreferredSize(new Dimension(420, 120));
			cartContentPanel.add(cartItemPanel);
			cartItemPanel.setLayout(null);
			
			JLabel productImageLB = new JLabel(cart.getProduct().getP_name());
			productImageLB.setIcon(new ImageIcon(CartListPanel_test.class.getResource(cart.getProduct().getP_img())));
			productImageLB.setBounds(40, 20, 80, 80);
			cartItemPanel.add(productImageLB);
			
			JLabel productTitleLB = new JLabel(cart.getProduct().getP_name());
			productTitleLB.setBounds(132, 50, 100, 25);
			productTitleLB.setText(cart.getProduct().getP_name());
			cartItemPanel.add(productTitleLB);
			
			JLabel lblTotprice = new JLabel("가격");
			lblTotprice.setBounds(286, 50, 80, 25);
			cartItemPanel.add(lblTotprice);
			
			JComboBox cartItemQtyCB = new JComboBox();
			cartItemQtyCB.setBounds(210, 50, 50, 25);
			cartItemPanel.add(cartItemQtyCB);
			
			JButton cartItemUpdateBTN = new JButton("수정");
			cartItemUpdateBTN.setBounds(350, 35, 55, 23);
			cartItemPanel.add(cartItemUpdateBTN);
			
			JButton cartItemDeleteBTN = new JButton("삭제");
			cartItemDeleteBTN.setBounds(350, 75, 55, 23);
			cartItemPanel.add(cartItemDeleteBTN);
			
			
		}
	}
}
