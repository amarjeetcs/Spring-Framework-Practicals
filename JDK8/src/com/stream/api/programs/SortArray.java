package com.stream.api.programs;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] arr= {50,40,30,20,10};
		/*
		 * Arrays.sort(arr); for(int i:arr) { System.out.println(i); }
		 */
		
		Arrays.stream(arr).sorted().forEach(a->{
			System.out.println(a);
		});
	
	}

}
