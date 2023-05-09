package com.amarjeet.servlet.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UsingGenericServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Using Generic Servlet");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("Using Generic Servlet");
	}

}
