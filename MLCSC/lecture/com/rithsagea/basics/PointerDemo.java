package com.rithsagea.basics;

public class PointerDemo {
	public static void main(String[] args) {
		Integer a = new Integer(5);
		Integer b = new Integer(5);
		
		System.out.printf("a == b : %b\n", a == b);
		System.out.printf("a.equals(b) : %b\n", a.equals(b));
	}
}
