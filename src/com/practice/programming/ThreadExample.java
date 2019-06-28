package com.practice.programming;
class ThreadMethods {
	static synchronized void methodA(String threadName) {
		System.out.println("Hello Rajkumar--method A--"+threadName+" Start");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello Rajkumar--method A--"+threadName+" End");
	}

	 void methodB(String threadName) {
		System.out.println("Hello Rajkumar--method B--"+threadName+" Start");
		try {
			//Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello Rajkumar--method B--"+threadName+" End");

	}

	 void methodC(String threadName) {
		System.out.println("Hello Rajkumar--method C--"+threadName+ " Start");
		
		try {
			//Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello Rajkumar--method C--"+threadName+ " End");
	}
	
}

class MyThreadOne extends Thread {

	@Override
	public void run() {
		System.out.println("Before call MyThreadOne.methodA()");
		ThreadMethods.methodA("MyThreadOne");
	}
}

class MyThreadTwo extends Thread {

	@Override
	public void run() {
		ThreadMethods t1 = new ThreadMethods();
		ThreadMethods t2 = new ThreadMethods();
		System.out.println("Before call MyThreadTwo.methodA()");
		ThreadMethods.methodA("MyThreadTwo");
		t1.methodB("MyThreadTwo.t1");
		t1.methodC("MyThreadTwo.t1");
		t2.methodB("MyThreadTwo.t2");
		t2.methodC("MyThreadTwo.t2");
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		MyThreadOne objOne=new MyThreadOne();
		System.out.println("before start objOne.start()");
		objOne.start();
		System.out.println("afetr start objOne.start()");
		MyThreadTwo objTwo=new MyThreadTwo();
		System.out.println("before start objTwo.start()");
		objTwo.start();
		System.out.println("afetr start objTwo.start()");
	}
}
