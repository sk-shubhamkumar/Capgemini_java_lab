package com.pirate.ques7_3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		List<String> list2 = new ArrayList<>();
		
		list1.add("pen"); 
		list1.add("paper"); 
		list1.add("books"); 
		list1.add("rubber"); 
		list1.add("ink"); 

		list2.add("pen"); 
        list2.add("ink"); 
        list2.add("paper");
        
		/*System.out.print("No. of elements for list 1: ");
		int num1 = scan.nextInt();
		
		for(int i=0;i<num1;i++) {
			list1.add(scan.next());
		}
		
		System.out.print("No. of elements for list 1: ");
		int num2 = scan.nextInt();
		
		for(int i=0;i<num2;i++) {
			list1.add(scan.next());
		}*/
		
		list1.removeAll(list2);
		
		Iterator itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
