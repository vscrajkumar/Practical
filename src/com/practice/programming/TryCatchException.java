package com.practice.programming;

public class TryCatchException {
	public static void main(String[] args){
		int a=10;
		try{
			System.out.println("Test....");
			throw new Exception("Hello");
		}catch(Exception e){
			a=20;
			System.out.println("catch a--"+a);
			return;
		}finally{
			a=30;
			System.out.println("finally a--"+a);
			return;
		}
	}
}

