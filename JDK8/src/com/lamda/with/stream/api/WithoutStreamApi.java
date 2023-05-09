package com.lamda.with.stream.api;
import java.util.*;
public class WithoutStreamApi {
	public static void main(String[] args) {
		List<String> str1=new ArrayList<String>();
		List<String> str2=new ArrayList<String>();
		
		str1.add("A");
		str1.add("B");
		str1.add("B");
		str1.add("C");
		
		for(String s:str1)
		{
			if(!str2.contains(s))
			{
				str2.add(s);
			}
			
		}
		System.out.println(str2);
		
	}

}
