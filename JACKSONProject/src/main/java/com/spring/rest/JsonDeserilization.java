package com.spring.rest;

import java.io.*;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDeserilization<JsonDeserilization> {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Student s = objectMapper.readValue(new File("C:\\Users\\USER\\Desktop\\JavaWorkSpace\\JACKSONProject\\src\\main\\resources\\student.json"), Student.class);
		System.out.println(s);
		System.out.println(objectMapper);
	}

}
