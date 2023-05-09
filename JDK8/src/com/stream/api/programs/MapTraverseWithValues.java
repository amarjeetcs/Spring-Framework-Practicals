package com.stream.api.programs;
import java.util.*;
public class MapTraverseWithValues {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "Amarjeet");
		m.put(2, "Rajnish");
		m.put(3, "Hira");
		
		m.values().stream().forEach(e->{
			System.out.println(e);
		});
	}

}
