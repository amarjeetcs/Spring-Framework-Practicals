package com.stream.api.programs;
import java.util.*;
public class RemoveNullFromCollection {
	public static void main(String[] args) {
		List<String> str=new ArrayList<String>();
		str.add("Aamrjeet");
		str.add("Sanjeet");
		str.add("Hira");
		str.add(null);
		
		str.stream().filter(a->a!=null).forEach(a->{
			System.out.println(a);
		});
		
		
	}

}
