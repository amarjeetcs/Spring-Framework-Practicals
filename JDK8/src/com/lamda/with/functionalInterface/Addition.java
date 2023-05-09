package com.lamda.with.functionalInterface;

interface inter {
	public void m1(int a, int b);
}

public class Addition {
	public static void main(String[] args) {
		inter i = (a, b) -> System.out.println(a + b);
		i.m1(10, 20);
	}

}
