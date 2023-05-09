package com.spring.rest;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Student {
	private int id;
	private String name;
	private String city;
	private String college;
	private String state;
	private String country;
	private Account account;
	private List<Orders> orders;
	
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student(int id, String name, String city, String college, String state, String country) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.college = college;
		this.state = state;
		this.country = country;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
