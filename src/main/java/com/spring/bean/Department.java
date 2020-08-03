package com.spring.bean;

public class Department {
	private User customer;
	private String department;
	
	public Department() {
		super();
	}	
	public Department(User customer, String department) {
		super();
		this.customer = customer;
		this.department = department;
	}

	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
