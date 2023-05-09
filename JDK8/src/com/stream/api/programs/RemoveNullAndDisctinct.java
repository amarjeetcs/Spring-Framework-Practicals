package com.stream.api.programs;
import java.util.*;
public class RemoveNullAndDisctinct {
	public static void main(String[] args) {
		List<String> str=new ArrayList<String>();
		str.add("Aamrjeet");
		str.add("Sanjeet");
		str.add("Sanjeet");
		str.add("Hira");
		str.add(null);
		
		str.stream().distinct().filter(a->a!=null).forEach(a->{
			System.out.println(a);
		});
		
		
	}

}
