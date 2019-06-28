package com.practice.principle;

import java.util.Collections;

abstract class One{
	
	public abstract void displayOne();
	
}

abstract class Two extends One{
	
	public abstract void displayTwo();
	
}

abstract class Three extends Two{
	
	public abstract void displayThree();
	
}
class ConcreateClass extends Three{
	
	public void displayOne(){
		System.out.println("displayOne");
	}
	public void displayTwo(){
		System.out.println("displayTwo");
	}
	public void displayThree(){
		System.out.println("displayThree");
	}
	
}
class ConcreateClassTwo extends Three{
	
	public void displayOne(){
		System.out.println("displayOne");
	}
	public void displayTwo(){
		System.out.println("displayTwo");
	}
	public void displayThree(){
		System.out.println("displayThree");
	}
}
public class AbstractExample{	
	public static void main(String[] args) {
		
		ConcreateClassTwo obj2=new ConcreateClassTwo();
		obj2.displayOne();
		obj2.displayTwo();
		obj2.displayThree();
		

	}
}


