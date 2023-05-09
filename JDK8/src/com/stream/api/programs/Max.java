package com.stream.api.programs;

import java.util.Arrays;

public class Max {
	public static void main(String[] args) {
		int[] arr= {10,20,30,6,50};
		int max=Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
	}

}
