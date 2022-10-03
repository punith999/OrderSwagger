package com.rst.Order.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	private int orderId;
	private String oderName;
	private String orderQty;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOderName() {
		return oderName;
	}
	public void setOderName(String oderName) {
		this.oderName = oderName;
	}
	public String getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(String orderQty) {
		this.orderQty = orderQty;
	}
	public Orders(int orderId, String oderName, String orderQty) {
		super();
		this.orderId = orderId;
		this.oderName = oderName;
		this.orderQty = orderQty;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Oder [orderId=" + orderId + ", oderName=" + oderName + ", orderQty=" + orderQty + "]";
	}
	

}
