package com.practice.programming;

public class TryWitFinally {

	public static void main(String[] args) {
		
		String name="Rajkumar";
		try{
			
			name="Ashok";
			
		}finally{
			name="Tata";
		}
		
		System.out.println("name==="+name);
	}
}
