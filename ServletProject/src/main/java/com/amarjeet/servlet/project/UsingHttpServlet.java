package com.amarjeet.servlet.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsingHttpServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		System.out.println("I am get method...");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>Http Get method calling..<h1>");
	}
}
