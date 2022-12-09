package com.toStringmethodInheritance;

public class OverrideToStringMethod {
	int rollNumber;
	String name;

	public OverrideToStringMethod(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	@Override
	public String toString() {
		return "[" + rollNumber + ","+name+"]";
	}
	public static void main(String[] args) {
		OverrideToStringMethod student = new OverrideToStringMethod(1, "Arjun");
		System.out.println(student);
	}
}
