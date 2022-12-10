package com.pankajpackage;

public class TestingPushPull {
	public static void main(String[] args) {
		String s = "Test Pull and Push";
		System.out.println(s);
		StringBuffer sb = new StringBuffer(s);
		String s1 = sb.reverse().toString();
		System.out.println(s1);
	}
}
