package com.logicalprogram;

public class Parent {
	static int a =10;

	public Parent() {
		
		System.out.println("constructor"); 
	}
	
	public Parent(int a,String b) {
		this();
		System.out.println("parameterized constructor"); 

	}

	private static void m1() {
		a=20;
	//System.out.println(a);
		System.out.println("static method"); 
	}

	static {

		System.out.println("static block"); 
	}


	public static void main(String[] args) {
		
		
		//int a =5;

		Parent p = new Parent(25,"naji");
		//System.out.println(a);  //5
		//System.out.println(p.a);  //10
		System.out.println("static variable"+a);
		//p.m1();   //20
		m1();
	}

}
