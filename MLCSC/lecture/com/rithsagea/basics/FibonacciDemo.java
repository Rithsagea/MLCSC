package com.rithsagea.basics;

public class FibonacciDemo {
	
	public static String repeat(String str, int num) {
		StringBuilder builder = new StringBuilder();
		for(int x = 0; x < num; x++) builder.append(str);
		return builder.toString();
	}
	
	
	public static int fib(int level) {
		if(level <= 1) return level;
		
		return fib(level - 1) + fib(level - 2);
	}
	
	public static int fib(int level, int height) {
		System.out.printf("%sfib(%d)\n", repeat("    ", height), level);
		int val;
		
		if(level <= 1) {
			val = level;
		} else {
			val = fib(level - 1, height + 1) + fib(level - 2, height + 1);
		}
		
		return val;
	}
	
	public static void main(String[] args) {
		int n = 5;
		
		//0  1  2  3  4  5  6  7   8
		//0, 1, 1, 2, 3, 5, 8, 13, 21
		
		System.out.printf("The %dth fibonnacci number is %d\n", n, fib(n));
	}
}
