package com.example;

public class Example {
	
	int a = 10;
	int b = 20;
	int c = 30;
	
	int div( int a , int b) {
		if(b!=0) {
			return a/b;
		}
		return 0;
	}

	int add(int c , int a, int b ) {
		System.out.println("New comment : abc");
		return a + b + c;
	}
	
	// This is multiplication. Comment added.
	int mul( int a, int b, int c) {
		return a*b*c;
	}
	int sub(int a, int c) {
		return a-c;
	}
}
