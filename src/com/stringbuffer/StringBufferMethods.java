package com.stringbuffer;

public class StringBufferMethods {
	public static void m1() {// length() method
		StringBuffer sb = new StringBuffer("Hola Amigo");
		System.out.println(sb.length());
	}
	public static void m2() {// capacity() method
		StringBuffer sb = new StringBuffer("");
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer("Somnath");
		System.out.println(sb.capacity());
	}
	public static void appendMethod() {// appendMethod()
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.append(" World"));
	}
	public static void reverseMethod() { // reverseMethod()
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.reverse());
	}
	//mutableProof() method
	public static void mutableProof() {// SB is mutable
		String s = new String("Hello");
		s.concat(" World");
		System.out.println("s: "+s);
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println("sb: "+sb);
	}
	
}














