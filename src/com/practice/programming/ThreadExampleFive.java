package com.practice.programming;

class SharedResourecOne {

	void printNormalMethod(int val) {

		try {
			for (int i = 1; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "--printNormalMethod -" + val * i);
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	synchronized void printSynchronizedMethodOne(int val) {

		try {
			for (int i = 1; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "--printSynchronizedMethodOne -" + val * i);
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	synchronized void printSynchronizedMethodTwo(int val) {

		try {
			for (int i = 1; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "--printSynchronizedMethodTwo -" + val * i);
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static synchronized void printStaticSynchronizedMethodOne(int val) {
		try {
			for (int i = 1; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "--printStaticSynchronizedMethodOne -" + val * i);
				Thread.sleep(5000);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static synchronized void printStaticSynchronizedMethodTwo(int val) {

		try {
			for (int i = 1; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "--printStaticSynchronizedMethodTwo -" + val * i);
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class ThreadThree extends Thread {
	SharedResourecOne obj;

	ThreadThree(SharedResourecOne obj) {
		this.obj = obj;
	}

	public void run() {
		obj.printNormalMethod(100);
		//obj.printSynchronizedMethodOne(5);
		// obj.printSynchronizedMessageTwo(5);
		 //obj.printStaticSynchronizedMethodOne(5);
		// obj.printStaticSynchronizedMessageTwo(5);

	}
}

class ThreadFour extends Thread {
	SharedResourecOne obj;

	ThreadFour(SharedResourecOne obj) {
		this.obj = obj;
	}

	public void run() {
		//obj.printNormalMethod(100);
		 //obj.printSynchronizedMethodOne(100);
		// obj.printSynchronizedMessageTwo(100);
		 //obj.printStaticSynchronizedMethodOne(100);
		obj.printStaticSynchronizedMethodTwo(100);

	}
}

public class ThreadExampleFive {

	public static void main(String[] args) {

		SharedResourecOne obj = new SharedResourecOne();

		ThreadThree t1 = new ThreadThree(obj);
		ThreadFour t2 = new ThreadFour(obj);
		t1.start();
		t2.start();
	}
}
