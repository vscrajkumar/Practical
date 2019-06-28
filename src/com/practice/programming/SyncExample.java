package com.practice.programming;
class Message1 {
	int val=100;
	public void displayMsg() {
		System.out.println("==>displayMsg " + Thread.currentThread().getName() + " Start" );
		for (int i = 0; i < 5; i++) {
			System.out.println("===>displayMsg -- " + Thread.currentThread().getName() + " i - " + i);
			try {
				val=val+1;
				System.out.println("====>displayMsg " + Thread.currentThread().getName() + " val--"+val);
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("displayMsg " + Thread.currentThread().getName() + " End");

	}
	public  synchronized void  displaySynchronizedMsgOne() {
		System.out.println("=>displaySynchronizedMsgOne " + Thread.currentThread().getName() + " Start ");
		for (int i = 0; i < 5; i++) {
			System.out.println("==>displaySynchronizedMsgOne -- "+Thread.currentThread().getName() + " i - " + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("===>displaySynchronizedMsgOne " + Thread.currentThread().getName() + " End ");
	}
	public  synchronized void  displaySynchronizedMsgTwo() {
		System.out.println("=>displaySynchronizedMsgTwo " + Thread.currentThread().getName() + " Start ");
		for (int i = 0; i < 5; i++) {
			System.out.println("==>displaySynchronizedMsgTwo -- "+Thread.currentThread().getName() + " i - " + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("===>displaySynchronizedMsgTwo " + Thread.currentThread().getName() + " End ");
	}

	public static synchronized void  displayStaticSynchronizedMsgOne() {
		System.out.println("=>displayStaticSynchronizedMsgOne " + Thread.currentThread().getName() + " Start ");
		for (int i = 0; i < 5; i++) {
			System.out.println("==>displayStaticSynchronizedMsgOne -- "+Thread.currentThread().getName() + " i - " + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("===>displayStaticSynchronizedMsgOne " + Thread.currentThread().getName() + " End ");
	}
	public static synchronized void  displayStaticSynchronizedMsgTwo() {
		System.out.println("=>displayStaticSynchronizedMsgTwo " + Thread.currentThread().getName() + " Start ");
		for (int i = 0; i < 5; i++) {
			System.out.println("==>displayStaticSynchronizedMsgTwo -- "+Thread.currentThread().getName() + " i - " + i);
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

class MyClass1 extends Thread {
	Thread t;
	Message1 msg;

//	MyClass1(Message1 msg) {
//		this.msg = msg;
//		t = new Thread(this);
//		t.start();
//	}

	MyClass1() {
		for(int i=0;i<5;i++){
			msg = new Message1();
			t = new Thread();
			if(i==0)
				t.setName("THREAD-ONE");
			else if(i==1)
				t.setName("THREAD-TWO");
			else if(i==2)
				t.setName("THREAD-THREE");
			else if(i==3)
				t.setName("THREAD-FOUR");
			else if(i==4)
				t.setName("THREAD-FIVE");
			
			t.start();
		}
	}

	@Override
	public void run() {
		//msg.displayMsg();
		msg.displaySynchronizedMsgOne();
		msg.displaySynchronizedMsgTwo();
		msg.displayStaticSynchronizedMsgOne();
		msg.displayStaticSynchronizedMsgTwo();
		//Message1.displayMsg();
		//msg.displayMsgOne();
	}
}

public class SyncExample {
	public static void main(String[] args) {
		
		//Message1 msg1 = new Message1();
		//Message1 msg2 = new Message1();
		// Two threads on msg1 object
		MyClass1 mc1 = new MyClass1();
		
		//MyClass1 mc2 = new MyClass1();
		//MyClass1 mc3 = new MyClass1();
		//MyClass1 mc4 = new MyClass1();
		//MyClass1 mc5 = new MyClass1();

		// Two threads on msg2 object
		//MyClass1 mc3 = new MyClass1();
		//MyClass1 mc4 = new MyClass1();
	}
}