package com.stringdemo;
//Narcissus21A
public class StringDemo {
	static String name;
	static String name1 = "";

	public static void main(String[] x) {
		String s = new String("Hello");//created string by using 'new' keyword
		System.out.println(s);
		
		String t = "Hi, Hello";// created string by using 'literal'
		System.out.println(t);
		
		String st = "Whoaa, ";//immutable
		st = st + "It's Mars.";//concat method can be used here, see below
		System.out.println(st);
		
		String ts = "Hey, ";
		ts = ts.concat("Look at the stars.");//using concat method
		System.out.println(ts);
		
		String ts1 = "Hey, ";
		ts1.concat("Look at the stars.");// concat method doesn't work here
		System.out.println(ts1);
		
		String ts2 = "Hey Sam, ";
		System.out.println(ts2.concat("Look at Sussan."));
		
		String ts3 = "Hello, ";
		String ts4 = ts3.concat("Amitabh sir.");//using concat method
		System.out.println(ts4);
		
		String c1 = "123";
		c1 = c1+'5';
		System.out.println(c1);
		
		//String name; made this static at class level, look above
		System.out.println(name);
		
		System.out.println(name1);
		System.out.println("nothing printed on above line, because of the value assigned to 'name1'");
	}	
}
