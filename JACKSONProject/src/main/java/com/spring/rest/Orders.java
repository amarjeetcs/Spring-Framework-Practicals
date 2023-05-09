package com.spring.rest;

public class Orders {
	private int orderId;
	private String orderName;
	private int quantity;
	private float price;
	private boolean delivered;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	public Orders(int orderId, String orderName, int quantity, float price, boolean delivered) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.quantity = quantity;
		this.price = price;
		this.delivered = delivered;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderName=" + orderName + ", quantity=" + quantity + ", price=" + price
				+ ", delivered=" + delivered + "]";
	}
	

}
