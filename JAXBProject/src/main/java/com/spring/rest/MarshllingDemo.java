package com.spring.rest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshllingDemo {
	
	public static void main(String[] args) throws JAXBException {
		JAXBContext context=JAXBContext.newInstance(Student.class);
		Marshaller m=context.createMarshaller();
		Student s=new Student();
		s.setId(101);
		s.setName("Amarjeet");
		s.setCity("Bhopal");
		s.setCollege("IES College Bhopal");
		s.setState("Madheya Pradesh");
		s.setCountry("India");
		
		m.marshal(s, System.out);
	}
	

}
