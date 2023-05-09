package com.spring.rest;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshlling {
	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Unmarshaller m = context.createUnmarshaller();
		Student student = (Student) m
				.unmarshal(new File("D:\\Orders.xml"));
		System.out.println(student);

	}

}
