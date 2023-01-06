package com.itwill.tmr_house.cart.김혜지;

/*
이름             널?       유형            
-------------- -------- ------------- 
P_NO           NOT NULL NUMBER(10)    
P_NAME                  VARCHAR2(50)  
P_PRICE                 NUMBER(10)    
P_IMG                   VARCHAR2(50)  
P_DESC                  VARCHAR2(512) 
P_FREEDELIVERY          VARCHAR2(50) 
*/
public class Cart {
	private int c_no;
	private String m_id;
	private int p_no;
	private int c_qty;
	private String p_img;
	private String p_freeDelivery;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(int c_no, String m_id, int p_no, int c_qty, String p_img, String p_freeDelivery) {
		super();
		this.c_no = c_no;
		this.m_id = m_id;
		this.p_no = p_no;
		this.c_qty = c_qty;
		this.p_img = p_img;
		this.p_freeDelivery = p_freeDelivery;
	}

	public int getC_no() {
		return c_no;
	}

	public void setC_no(int c_no) {
		this.c_no = c_no;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public int getC_qty() {
		return c_qty;
	}

	public void setC_qty(int c_qty) {
		this.c_qty = c_qty;
	}

	public String getP_img() {
		return p_img;
	}

	public void setP_img(String p_img) {
		this.p_img = p_img;
	}

	public String getP_freeDelivery() {
		return p_freeDelivery;
	}

	public void setP_freeDelivery(String p_freeDelivery) {
		this.p_freeDelivery = p_freeDelivery;
	}

	@Override
	public String toString() {
		return "Cart [c_no=" + c_no + ", m_id=" + m_id + ", p_no=" + p_no + ", c_qty=" + c_qty + ", p_img=" + p_img
				+ ", p_freeDelivery=" + p_freeDelivery + "]";
	}
	
	
	

}
