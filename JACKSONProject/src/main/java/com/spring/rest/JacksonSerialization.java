package com.spring.rest;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonSerialization {
	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		Student s=new Student();
		
		s.setId(101);
		s.setName("Amarjeet");
		s.setCity("Banglore");
		s.setCollege("IES COLLEGE BHOPAL");
		s.setState("Bihar");
		s.setCountry("India");
		
		
		Account account=new Account();
		account.setAccountNumber(626153506);
		account.setBalance(50000);
		account.setBranchName("SBI Turki muzaffarpur");
		account.setBankName("SBI Bank");
		
		ArrayList<Orders> ordersList=new ArrayList<Orders>();
		Orders order1=new Orders();
		order1.setOrderId(101);
		order1.setOrderName("Mobile");
		order1.setPrice(2000);
		order1.setQuantity(4);
		order1.setDelivered(true);
		
		Orders order2=new Orders();
		order2.setOrderId(102);
		order2.setOrderName("Laptop");
		order2.setPrice(2000);
		order2.setQuantity(4);
		order2.setDelivered(true);
		
		Orders order3=new Orders();
		order3.setOrderId(103);
		order3.setOrderName("Table");
		order3.setPrice(2000);
		order3.setQuantity(4);
		order3.setDelivered(true);
		
		ordersList.add(order1);
		ordersList.add(order2);
		ordersList.add(order3);
		
		s.setAccount(account);
		s.setOrders(ordersList);
		
		String json=mapper.writeValueAsString(s);
		System.out.println(json);
		
		
	}

}
