package com.vasu.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest1 {

	public static void main(String[] args) 
	{
		List<Object> l=new ArrayList<>();
		l.add(12);
		l.add(34);
		l.add(12.45);
		l.add("Vasu");
		
		System.out.println(l.size());
		/*for (int i = 0; i < l.size(); i++) 
		{
			System.out.println(l.get(i));
		}*/
		
		for (Object v : l)
		{
			System.out.println(v);
		}
		

	}

}
