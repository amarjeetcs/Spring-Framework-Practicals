package com.lamda.with.stream.api;
import java.util.*;

public class WithStreamApi {
	public static void main(String[] args) {
		List<String> str1=new ArrayList<String>();
		
		
		str1.add("A");
		str1.add("B");
		str1.add("C");
		str1.add("C");
		
		str1.stream().distinct().forEach(x->{
			System.out.println(x);
		});
	}

}
