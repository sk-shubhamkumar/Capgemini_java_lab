package com.pirate.ques7_4;

import java.util.*;

public class Main {

	public static Map square(List<Integer> list) {
		
		Map<Integer,Integer> sqrMap = new HashMap<>();
		
		for(int i : list) {
			sqrMap.put(i, i*i);
		}
		return sqrMap ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(8);
		list.add(4);
		list.add(3);
		list.add(5);
		
		System.out.println(square(list));
		
		
	}

}
