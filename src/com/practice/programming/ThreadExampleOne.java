package com.practice.programming;

class SharedResourec {
	synchronized void printMessage(int val) {

		for (int i = 1; i < 5; i++) {
			System.out.println("val-" + val * i);
		}
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class ThreadOne extends Thread {
	SharedResourec obj;

	ThreadOne(SharedResourec obj) {
		this.obj = obj;
	}

	public void run() {
		obj.printMessage(5);
	}
}

class ThreadTwo extends Thread {
	SharedResourec obj;

	ThreadTwo(SharedResourec obj) {
		this.obj = obj;
	}

	public void run() {
		obj.printMessage(100);
	}
}

public class ThreadExampleOne {

	public static void main(String[] args) {

		SharedResourec obj=new SharedResourec();
		
		ThreadOne t1=new ThreadOne(obj);
		ThreadTwo t2=new ThreadTwo(obj);
		t1.start();
		t2.start();
	}
}
