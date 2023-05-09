package com.amarjeet.servlet.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ImplementingServlerInterface implements Servlet{

	

	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("initilizing servlet...");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("servicing....");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Hello World");
		out.println("<h3>Today data is : "+new Date().toString()+"</h3>");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("Object is going to destroy...");
		
	}
	
	

}
