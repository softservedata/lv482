package com.softserve.edu.inheritance;

public class B extends A {
	public int j;

	// Java Compiler insert default constructor public B(){}
	public B() {
		//super();
		System.out.println("class B: Constructor");
		j = 121;
	}

	@Override
	public void m1() {
		System.out.println("class B: m1()");
		//m1(); // Recursive 
		//super.m1();
		m2(); // From class B
	}
	
	public static void m2() {
		System.out.println("class B: m2()");
		//m4(); // error
	}

	//private void m3() { // Architecture Error
	public void m3() {
		System.out.println("class B: m3()");
	}

	public void m4() {
		System.out.println("class B: m4()");
	}

}
