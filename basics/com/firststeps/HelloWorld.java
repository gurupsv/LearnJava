package com.firststeps;

public class HelloWorld {
	
	static String mystring = "This is the test string";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!! "+ mystring);
		System.out.println(mystring.length());
		
//		int n=21 ,N = 21;
//		if ( n%2 != 0 )	System.out.println("Weird");
//		else if (n>2 & n<=5 ) System.out.println("Not Weird");
//		else if (n>5 & n <=20 ) System.out.println("Weird");
//		else System.out.println("Not Weird");
//
//		System.out.printf("%-30s %05d\n",mystring,n);
//		
//        for (int i=1;i<=10;i++) {
//            System.out.println(N+" X "+i+" = "+i*N);
//        }
		
		int a=5,b=3,n=5;
		int baseno=1;
		int finalno=a+baseno*b;
		System.out.print(finalno);
		System.out.print(" ");
		for (int i=1;i<n;i++) {
			baseno*=2;
			finalno=finalno+baseno*b;
			System.out.print(finalno);
			System.out.print(" ");
			
		}
	}

}
