package com.firststeps;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is the test string";
		
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.concat(" - Appended string"));
		System.out.println(str.contains("is"));
		System.out.println(str.contains("Guru"));
		System.out.println(str.startsWith("This"));
		System.out.println(str.startsWith("Check"));
		System.out.println(str.endsWith("string"));
		System.out.println(str.endsWith("Nothing"));
		System.out.println(str.contentEquals("Nothing"));
		
		System.out.println(str.indexOf("test"));
		System.out.println(str.isEmpty());
		System.out.println(str.trim());
		System.out.println(str.replace("e", "a"));
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 10));
		
		char[] charArray=str.toCharArray();
		
//		for (int i = 0; i<charArray.length; i++) {
//			System.out.println(charArray[i]);
//		}

		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}

}
