package com.practice.programming;

class PolymorphismExampleTwo {
	
	public int methodOne(String name){
		
		System.out.println("methodOne--parent--"+name);
		return 10;
	}
}
public class PolymorphismExampleOne  extends PolymorphismExampleTwo{
	
	public int methodOne(String name){
		//super.methodOne(name);
		System.out.println("methodOne--child--"+name);
		return 10;
	}

	public String methodOne(String name,String name1){
		super.methodOne(name);
		System.out.println("methodOne--child--"+name);
		return "Hello";
	}

	public static void main(String args[]){
		//below is error one because the class  PolymorphismExampleOne doesn't contains methodOne method with two string arguments
		PolymorphismExampleTwo one=new PolymorphismExampleOne();
		//PolymorphismExampleOne one=new PolymorphismExampleOne();

		System.out.println(one.methodOne("Rajkumar"));
		//System.out.println(one.methodOne("Rajkumar","Ashok"));

	}
}
