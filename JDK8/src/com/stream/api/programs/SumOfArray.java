package com.stream.api.programs;

import java.util.Arrays;

public class SumOfArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int sum=Arrays.stream(arr).sum();
		System.out.println(sum);
	}

}
