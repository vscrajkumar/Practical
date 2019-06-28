package com.practice.programming;

class Message {
	int val = 100;

	public void displayMsg() {
		System.out.println("==>displayMsg " + Thread.currentThread().getName() + " Start");
		for (int i = 0; i < 5; i++) {
			System.out.println("===>displayMsg -- " + Thread.currentThread().getName() + " i - " + i);
			try {
				val = val + 1;
				System.out.println("====>displayMsg " + Thread.currentThread().getName() + " val--" + val);
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("displayMsg " + Thread.currentThread().getName() + " End");

	}

	public synchronized void displaySynchronizedMsgOne() {
		System.out.println("=>displaySynchronizedMsgOne " + Thread.currentThread().getName() + " Start ");
		for (int i = 0; i < 5; i++) {
			System.out.println("==>displaySynchronizedMsgOne -- " + Thread.currentThread().getName() + " i - " + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("===>displaySynchronizedMsgOne " + Thread.currentThread().getName() + " End ");
	}

	public synchronized void displaySynchronizedMsgTwo() {
		System.out.println("=>displaySynchronizedMsgTwo " + Thread.currentThread().getName() + " Start ");
		for (int i = 0; i < 5; i++) {
			System.out.println("==>displaySynchronizedMsgTwo -- " + Thread.currentThread().getName() + " i - " + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("===>displaySynchronizedMsgTwo " + Thread.currentThread().getName() + " End ");
	}

	public static synchronized void displayStaticSynchronizedMsgOne() {
		System.out.println("=>displayStaticSynchronizedMsgOne " + Thread.currentThread().getName() + " Start ");
		for (int i = 0; i < 5; i++) {
			System.out
					.println("==>displayStaticSynchronizedMsgOne -- " + Thread.currentThread().getName() + " i - " + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("===>displayStaticSynchronizedMsgOne " + Thread.currentThread().getName() + " End ");
	}

	public static synchronized void displayStaticSynchronizedMsgTwo() {
		System.out.println("=>displayStaticSynchronizedMsgTwo " + Thread.currentThread().getName() + " Start ");
		for (int i = 0; i < 5; i++) {
			System.out
					.println("==>displayStaticSynchronizedMsgTwo -- " + Thread.currentThread().getName() + " i - " + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("===>displayStaticSynchronizedMsgTwo " + Thread.currentThread().getName() + " End ");
	}
}

class MyClass extends Thread {
	Thread t;
	Message msg;

	// MyClass1(Message1 msg) {
	// this.msg = msg;
	// t = new Thread(this);
	// t.start();
	// }

	MyClass(String threadName) {
			msg = new Message();
			t = new Thread(this);
			t.setName(threadName);
			t.start();
	}

	@Override
	public void run() {
		// msg.displayMsg();
		msg.displaySynchronizedMsgOne();
		msg.displaySynchronizedMsgTwo();
		msg.displayStaticSynchronizedMsgOne();
		msg.displayStaticSynchronizedMsgTwo();
		// Message1.displayMsg();
		// msg.displayMsgOne();
	}
}

public class ThreadExampleThree {
	public static void main(String[] args) {

		// Message1 msg1 = new Message1();
		// Message1 msg2 = new Message1();
		// Two threads on msg1 object
		MyClass mc1 = new MyClass("THREAD-ONE");
		MyClass mc2 = new MyClass("THREAD-TWO");

		// MyClass1 mc2 = new MyClass1();
		// MyClass1 mc3 = new MyClass1();
		// MyClass1 mc4 = new MyClass1();
		// MyClass1 mc5 = new MyClass1();

		// Two threads on msg2 object
		// MyClass1 mc3 = new MyClass1();
		// MyClass1 mc4 = new MyClass1();
	}
}