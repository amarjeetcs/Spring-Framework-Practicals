package com.stream.api.programs;

import java.util.*;
import java.util.Arrays;

public class FindLength {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("Using length method= " + arr.length);

		long count = Arrays.stream(arr).count();
		System.out.println("Using stream api= " + count);
	}

}
 