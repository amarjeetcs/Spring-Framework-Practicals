package com.stream.api.programs;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Average {
	public static void main(String[] args) {
		int[] arr= {10,20,30};
		OptionalDouble d=Arrays.stream(arr).average();
		System.out.println(d.getAsDouble());
		
	}

}
