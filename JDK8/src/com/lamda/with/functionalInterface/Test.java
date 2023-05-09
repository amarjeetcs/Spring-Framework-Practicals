package com.lamda.with.functionalInterface;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<Integer>();
		ls.add(20);
		ls.add(10);
		ls.add(25);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(ls,c);
		System.out.println(ls);
		
	}

}
