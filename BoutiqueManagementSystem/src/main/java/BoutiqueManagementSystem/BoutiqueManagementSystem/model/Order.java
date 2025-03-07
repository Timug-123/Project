package BoutiqueManagementSystem.BoutiqueManagementSystem.model;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Order {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private int customerId;
	private LocalDateTime orderDate = LocalDateTime.now();
	private String status; // "Pending", "Shipped", "Delivered"
	private Double totalAmount;

	public Order(int customerId, LocalDateTime orderDate, String status, Double totalAmount) {
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.status = status;
		this.totalAmount = totalAmount;

	}
	public Order() {
		
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
}