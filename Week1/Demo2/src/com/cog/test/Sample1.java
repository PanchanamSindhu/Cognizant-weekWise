package com.cog.test;

public class Sample1 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	}
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static String reverseString(String message) {
		
		StringBuilder st=new StringBuilder(message);
		return st.reverse().toString();
		
	}

}
