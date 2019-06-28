package com.practice.programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CloneExampleOne {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("raj");
		list.add("kumar");
		list.add("test");
		list.add("ashok");
		list.add("Xavier");
		list.add("43");

		List listTwo = new ArrayList();
		
		listTwo=(List)list.clone();
		System.out.println("before manipulatetion -- "+list.equals(listTwo));
		listTwo.remove(5);
		listTwo.add("431");

		System.out.println("after manipulatetion--1 -- "+list.equals(listTwo));

	}

}
