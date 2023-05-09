package com.lamda.with.functionalInterface;

interface Hello {
	public void m1();
}

public class HelloWorld {
	public static void main(String[] args) {
		Hello i = () -> System.out.println("Hello World with lamda expression...");
		i.m1();
	}

}
