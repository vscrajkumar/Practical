package com.practice.programming;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class LinkedListTest {
	public static void main(String args[]) throws Exception {
		LinkedList<String> li = new LinkedList<String>();
		li.add("Raj");
		li.add("Kumar");

		Iterator<String> itr = li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Queue<String> q=new DQueue<String>();

	}
}
