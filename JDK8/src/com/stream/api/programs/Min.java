package com.stream.api.programs;

import java.util.Arrays;

public class Min {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,3,2,3,5};
		int min=Arrays.stream(arr).min().getAsInt();
		System.out.println(min);
		boolean a=Arrays.stream(arr).isParallel();
		System.out.println(a);
	}

}
