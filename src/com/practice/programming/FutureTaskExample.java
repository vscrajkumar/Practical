package com.practice.programming;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.Callable;

class MyCallableOne implements Callable<String> {

	private long waitTime;
	
	public MyCallableOne(int timeInMillis){
		this.waitTime=timeInMillis;
	}
	@Override
	public String call() throws Exception {
		Thread.sleep(waitTime);
		System.out.println("MyCallableOne is completed");
        return Thread.currentThread().getName();
	}
}

class MyCallableTwo implements Callable<String> {

	private long waitTime;
	
	public MyCallableTwo(int timeInMillis){
		this.waitTime=timeInMillis;
	}
	@Override
	public String call() throws Exception {
		Thread.sleep(waitTime);
		System.out.println("MyCallableTwo is completed");
        return Thread.currentThread().getName();
	}
}

public class FutureTaskExample {

	public static void main(String[] args) {
		MyCallableOne callable1 = new MyCallableOne(7000);
		MyCallableTwo callable2 = new MyCallableTwo(5000);

		FutureTask<String> futureTask1 = new FutureTask<String>(callable1);
		FutureTask<String> futureTask2 = new FutureTask<String>(callable2);

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(futureTask1);
		executor.execute(futureTask2);
		
		while (true) {
			try {
				if(futureTask1.isDone() && futureTask2.isDone()){
					System.out.println("Both task 1 and task 2 is completed");
					System.out.println("futureTask1--"+futureTask1.get());
					System.out.println("futureTask2--"+futureTask2.get());
					executor.shutdown();
					return;
				}
				
				if(futureTask1.isDone()){
				//wait indefinitely for future task to complete
					System.out.println("FutureTask1 output="+futureTask1.get());
				}
				
				
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		
	}

}