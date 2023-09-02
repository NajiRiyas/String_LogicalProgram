package com.intr;

public class Child extends Parent{

	//1. Simple Inheritance
	public static void c1() {
		System.out.println("c1");
	}
	public void c2() {
		System.out.println("c2");
	}
	
//	@Override
//	public  void p2() {
//		System.out.println("Parent overried method in child class");
//
//	}
	
	public static void main(String[] args) {
		//With extends keyword
		Child c = new Child();
		//p1();
		//c.p2();
		c1();
		c.c2();
		//Without extends keyword
		Parent p = new Parent();
		p.p2();
		p.p1();
		
//		Parent p1 = new Child();
//		p1.p1();
//		p1.p2();
		
		
		
	}

}
