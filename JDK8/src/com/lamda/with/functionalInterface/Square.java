package com.lamda.with.functionalInterface;

interface inter1 {
	public int m1(int n);
}

public class Square {
	public static void main(String[] args) {
		inter1 i = n -> n * n;
		System.out.println(i.m1(4));
	}
}
