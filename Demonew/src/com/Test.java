package com;

public class Test {
	int a=10;
	
	public void m1() {
		System.out.println("m1 Method of a Test Class");
	}

	public static void main(String[] args) {
		
		System.out.println("main method Started...");
		
		Test t=new Test();
		System.out.println(t.a);
		t.m1();
	}
}
