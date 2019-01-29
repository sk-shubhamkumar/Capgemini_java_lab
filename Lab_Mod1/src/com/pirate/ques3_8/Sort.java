package com.pirate.ques3_8;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		String[] arr=new String[20]; 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number of String: ");
		int b=sc.nextInt();
		
		System.out.println("Enter the String: ");
		int i=b-1,j,a;
		for(j=0;j<b;j++)
			arr[j]=sc.next();
		
		
		System.out.println();
		String str="";
		
		for(j=0;j<b;j++)
			for(int k=0;k<b-j-1;k++)
			{
				a=arr[k].compareTo(arr[k+1]);
				if(a>0)
				{
					str=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=str;
				}
			}
		
		if(b%2==0) 
		{
			for( j=0;j<b/2;j++)
			{
				arr[j]=arr[j].toUpperCase();
			}	
			for( j=(b/2);j<b;j++)
			{
				arr[j]=arr[j].toLowerCase();
			}	
			
		}
		else 
		{
			for( j=0;j<(b/2)+1;j++)
			{
				arr[j]=arr[j].toUpperCase();
			}	
			for( j=(b/2)+1;j<b;j++)
			{
				arr[j]=arr[j].toLowerCase();
			}	
			
		}
		
		Sort s=new Sort();
		s.validate(arr,i+1);
		
	}

	public void validate(String arr[],int a){
		for(int i=0;i<a;i++)
			System.out.println(arr[i]);
		
	}
}