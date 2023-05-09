package com.stream.api.programs;

import java.util.Arrays;

public class Filter {
	public static void main(String[] args) {
		int[] arr= {10,11,12,13};
		Arrays.stream(arr).filter(x->x%2==0).forEach(x->{
			System.out.println(x);
		});
	}

}
