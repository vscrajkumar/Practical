package com.practice.programming;

class Parent
{
	Parent(){
	
		System.out.println("Parent Constructor");
	}
	static{
		System.out.println("Parent Static Block");
	}
	{
		System.out.println("Parent Block");
	}
}
public class StaticVsConstrucorEXample {

	public static void main(String[] args) {
		new Parent();
	}
}
