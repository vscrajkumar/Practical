package com.practice.programming;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class CallableExampleOn implements Callable<Object>{
	
	@Override
	public Object call() throws Exception 
	 { 
		System.out.println("CallableExampleOne start");
		Thread.sleep(50000);
	    Random generator = new Random(); 
	    Integer randomNumber = generator.nextInt(5); 
		System.out.println("CallableExampleOne End");
	    return randomNumber;
	 }
}

class CallableExampleTwo implements Callable<Object>{
	
	public Object call() throws Exception{
		System.out.println("CallableExampleTwo start");
		Thread.sleep(50000);
		Random randon=new Random();
		Integer ranInt=randon.nextInt(10);
		System.out.println("CallableExampleTwo end");
	    return ranInt;

	}
}

class CallableExampleThree implements Callable<Object>{

	public Object call() throws Exception{
		System.out.println("CallableExampleThree start");
		Thread.sleep(50000);
		Random randon=new Random();
		Integer ranInt=randon.nextInt(10);
		System.out.println("CallableExampleThree end");
	    return ranInt;

	}
}
class CallableExampleFour implements Callable<Object>{
	
	public Object call() throws Exception{
		System.out.println("CallableExampleFour start");
		Thread.sleep(50000);
		Random randon=new Random();
		Integer ranInt=randon.nextInt(10);
		System.out.println("CallableExampleFour end");
	    return ranInt;

	}
}
class CallableExampleFive implements Callable<Object>{
	
	public Object call() throws Exception{
		System.out.println("CallableExampleFive start");
		Thread.sleep(50000);
		Random randon=new Random();
		Integer ranInt=randon.nextInt(10);
		System.out.println("CallableExampleFive end");
	    return ranInt;

	}
}

public class CallableFutureCompleteExample {
	public static void main(String[] args)  throws Exception {
		System.out.println("Main Method");
	    FutureTask[] randomNumberTasks = new FutureTask[5];
	    
	    CallableExampleOn callableExampleOne = new CallableExampleOn();
	    CallableExampleTwo callableExampleTwo = new CallableExampleTwo();
	    CallableExampleThree callableExampleThree = new CallableExampleThree();
	    CallableExampleFour callableExampleFour = new CallableExampleFour();
	    CallableExampleFive callableExampleFive = new CallableExampleFive();
	    
		System.out.println("Afetr callable");

	    randomNumberTasks[0] = new FutureTask(callableExampleOne); 
	    randomNumberTasks[1] = new FutureTask(callableExampleTwo); 
	    randomNumberTasks[2] = new FutureTask(callableExampleThree); 
	    randomNumberTasks[3] = new FutureTask(callableExampleFour); 
	    randomNumberTasks[4] = new FutureTask(callableExampleFive); 
		System.out.println("After FutureTask");


	    for (int i = 0; i < 5; i++) 
	    { 
	      System.out.println(randomNumberTasks[i].get()); 
	  
	      
	    } 
	}

}
