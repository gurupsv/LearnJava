package com.firststeps;

import java.lang.Math;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=18;
		boolean isPrime=true;
		for (int i = 2; i < Math.sqrt(number);i++) {
			if ( number%i == 0) {
				System.out.println(Integer.toString(number)+" is not a prime number!!");
				isPrime=false;
				break;
			}
		
		}
		if (isPrime) System.out.println(Integer.toString(number)+" is a prime number!!");

	}

}
