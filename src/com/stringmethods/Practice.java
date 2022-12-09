package com.stringmethods;

import java.util.Scanner;

public class Practice {
	static int i;

	public static void m() {

		String s = "Programming";
		System.out.println("Enter a character to search in a string : ");
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		System.out.println(s.contains(x));

	}

	public static void main(String[] args) {
		m();
	}
}