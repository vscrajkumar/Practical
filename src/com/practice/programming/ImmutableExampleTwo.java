package com.practice.programming;

import java.util.ArrayList;
import java.util.List;

public class ImmutableExampleTwo {
	
	public static void main(String[] args) {
		
		final List l1=new ArrayList();
		
		l1.add("Hello");
		
		//for final in non primitive will always pointing to object reference.
		//the reference is can be modified
		//l1=new ArrayList();
		
	}

}
