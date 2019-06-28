package com.practice.programming;

public class ThreadExampleTwo {

	public synchronized void n1(int threadId) {
		snooze(threadId);
		System.out.println("Sync non static n1 " + threadId);
	}

	public void n2(int threadId) {
		snooze(threadId);
		System.out.println(" non static n2 " + threadId);
	}

	public static synchronized void s1(int threadId) {
		snooze(threadId);
		System.out.println("Sync static s1 " + threadId);
	}

	public static void s2(int threadId) {
		snooze(threadId);
		System.out.println(" static s2 " + threadId);
	}

	static void snooze(int threadId) {
		System.out.println("Waiting ... " + threadId);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThreadExampleTwo ob = new ThreadExampleTwo();
		ThreadExampleTwo ob2 = new ThreadExampleTwo();
		ThreadExampleTwo ob3 = new ThreadExampleTwo();

		Runnable r1 = () -> {
			/*
			 * ob.n1(10); ob.n2(10);
			 */
			ob.s1(10);
			// ob.s2(10);
		};

		Runnable r3 = () -> {
			/*
			 * ob2.n1(30); ob2.n2(30);
			 */
			ob2.s1(30);
			// ob2.s2(30);
		};

		Runnable r4 = () -> {
			/*
			 * ob3.n1(40); ob3.n2(40);
			 */
			ob3.s1(30);
			// ob3.s2(30);
		};

		Thread t1 = new Thread(r1);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		t1.start();
		t3.start();
		t4.start();
	}
}