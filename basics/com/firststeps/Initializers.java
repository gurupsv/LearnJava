package com.firststeps;

public class Initializers {
	
	{
		System.out.println("Iniside Initializer 01.");
	}
	public static String strng=null;
	Initializers() {
		System.out.println("Constructor (default) is called!!");
	}
	
	Initializers(String str){
		this();
		strng=str;
		System.out.println("Constructor with String arg is called!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Initializers myinit = new Initializers("mystring");
	}

	{
		System.out.println("Inside Initializer 02.");
	}
}
