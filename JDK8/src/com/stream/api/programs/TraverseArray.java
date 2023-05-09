package com.stream.api.programs;

import java.util.Arrays;

public class TraverseArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,40,50};
		/*
		 * for(int i:arr) { System.out.println(i); }
		 */
		
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 */
		
		Arrays.stream(arr).forEach(a->{
			System.out.println(a);
		});
	}

}
