package com.stringdemo;
//Narcissus21A
public class StringDemo1 {

	public static void main(String[] args) {//comparing memory addresses here not content
		//example 1
		String s = "Hello";//only SCP
		String t = "Hello";
		
		if (s == t) {// '==' is used to check references
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		//example 2
		String x = new String("Hello");//1 copy in heap memory & another copy in SCP of this same object
		String y = new String("Hello");
		
		if (s.equals(t)) {//equal method compares content here
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		//example 3
		if (x == y) {//'==' is used to check references
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		//example 4  
		if (x.equals(y)) {//compares content here
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
