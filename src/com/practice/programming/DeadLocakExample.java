package com.practice.programming;

class SharedResource{
	
	public  synchronized void methodOne(SharedResource s1){
		
		System.out.println("MethodOne...Before");
		s1.methodTwo(this);
		System.out.println("MethodOne...After");

	}
	public synchronized void methodTwo(SharedResource s2){
		System.out.println("MethodTwo...Before");
		s2.methodOne(this);
		System.out.println("MethodTwo...After");

	}
	
}
class MyThreadA extends Thread{
	
	SharedResource s1,s2;
	
	MyThreadA(SharedResource s1,SharedResource s2){
		this.s1=s1;
		this.s2=s2;
	}
	
	@Override
	public void run(){
		s1.methodTwo(s2);
	}
	
}
class MyThreadB extends Thread{
	
	SharedResource s1,s2;
	
	MyThreadB(SharedResource s1,SharedResource s2){
		this.s1=s1;
		this.s2=s2;
	}
	
	@Override
	public void run(){
		s2.methodOne(s1);
	}
	
}
public class DeadLocakExample {
	public static void main(String[] args) {
		SharedResource s1=new SharedResource();
		SharedResource s2=new SharedResource();
		
		MyThreadA objA=new MyThreadA(s1, s2);
		MyThreadB objB=new MyThreadB(s1, s2);
		objA.start();
		objB.start();
		
	}

}
