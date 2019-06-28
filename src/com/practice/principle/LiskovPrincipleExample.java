package com.practice.principle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface ICollection {
	public void gender();
}

class Ashok implements ICollection {

	public void gender() {
		System.out.println("Ashok--Make");
	}
}

class Priya implements ICollection {

	public void gender() {
		System.out.println("Ashok--Female");
	}
}

public class LiskovPrincipleExample {

	public static void main(String[] args) {

		List<ICollection> l1 = new ArrayList<ICollection>();

		l1.add(new Ashok());
		l1.add(new Priya());

		for (ICollection coll : l1) {
			coll.gender();
		}

	}

}
