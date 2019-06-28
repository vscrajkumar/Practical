package com.practice.programming;

class ThreadYeild extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Hello");
		// which is used tell to the currently executing thread to give chances equal priority thread.
		//running state into runnable thread
		yield();
		System.out.println("Rajkumar");

	}
}
public class ThreadYeildExample {

	public static void main(String[] args) {

		ThreadYeild obj=new ThreadYeild();
		obj.start();
		String ttt[];
	}
}
