package com.practice.programming;

class ParentOne{
	static{
		System.out.println("Parent Static Block");
	}
	ParentOne(){
		System.out.println("Parent Constructor");
		
	}
	{
		System.out.println("Parent Block");
	}
}

class Child extends ParentOne {
	static{
		System.out.println("Child Static Block");
	}
	Child(){
		System.out.println("Child Constructor");
	}
	{
		System.out.println("Child Block");
	}
	
}
public class StaticVsConstructorInheritenceExample {

	public static void main(String[] args) {
		new Child();
	}
}
