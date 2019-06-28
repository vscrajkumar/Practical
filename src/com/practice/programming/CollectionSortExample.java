package com.practice.programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionSortExample  {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("raj");
		list.add("kumar");
		list.add("test");
		list.add("ashok");
		list.add("Xavier");
		list.add("43");


		Collections.sort(list);
		
		Iterator e1=list.iterator();
		
		while(e1.hasNext()){
			System.out.println(e1.next());
		}
	}

}
