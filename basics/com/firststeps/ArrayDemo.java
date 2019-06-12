package com.firststeps;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myIntArray1= {100,3,6,2,9,66,77,22};
		/*
		 * myIntArray1 = new int[10]; myIntArray1[0]=100; myIntArray1[1]=90;
		 */
		
		System.out.println(myIntArray1[0]);
		
		String[] myStringArray1= {"BMW", "AUDI", "VOLVO"};
		
		System.out.println(myStringArray1[0]);
		
		System.out.println(myIntArray1.length);
		System.out.println(myStringArray1.length);
		System.out.println("======================");
		for (int i=0;i<myIntArray1.length;i++) System.out.println(myIntArray1[i]);
		System.out.println("======================");
		Arrays.parallelSort(myIntArray1);
		System.out.println("======================");
		for (int i=0;i<myIntArray1.length;i++) System.out.println(myIntArray1[i]);
		System.out.println("======================");

	}

}
