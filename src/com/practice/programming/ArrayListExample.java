package com.practice.programming;
import java.util.*;

public class ArrayListExample {
	public static void main(String args[]) {
		List list = new ArrayList();

		list.add("Rajkumar");
		list.add("Rajkumar");


		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// list.forEach((e) -> System.out.println(e));
	}

}
