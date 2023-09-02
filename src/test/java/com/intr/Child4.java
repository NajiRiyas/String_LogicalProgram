package com.intr;

public class Child4 extends Child3 {


	@Override
	void p1() {
		System.out.println("abstract method");		
	}

	@Override
	public void c3() {
		System.out.println("non abstract method");
		super.c3();
	}


public static void main(String[] args) {
	Child4 c = new Child4();
	c.c3();
	c.p1();
	c4();
	c.c5();
}
}
