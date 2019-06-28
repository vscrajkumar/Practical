package com.practice.programming;
class Account {

	static  synchronized void showAccount(String accountName) {
		System.out.println("My account name is " + accountName + " Holder Name is " + Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
	}
}

class MyThread1 extends Thread {
	@Override
	public void run() {
		Account.showAccount("Dineshonjava.com");
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		Account.showAccount("Linkedin.com");
	}
}

class MyThread3 extends Thread {
	@Override
	public void run() {
		Account.showAccount("Facebook.com");
	}
}

class MyThread4 extends Thread {
	@Override
	public void run() {
		Account.showAccount("Twitter.com");
	}
}

public class StaticSyncExcample {
	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		MyThread3 t3 = new MyThread3();
		MyThread4 t4 = new MyThread4();
		t1.setName("DAV JavaServices");
		t2.setName("dinesh.rajput");
		t3.setName("dineshonjava");
		t4.setName("admin@dineshonjava.com");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
