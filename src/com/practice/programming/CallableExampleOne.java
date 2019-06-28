package com.practice.programming;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class CallableExampleOne {
	public static void main(String[] args) {
		final List<Integer> integers =  Arrays.asList(1,2,3,4,5);
		System.out.println("debug--1");

		Callable<Integer> callableObj = () -> {
			int result = integers.stream().mapToInt(i -> i.intValue()).sum();
			return result;
		};
		System.out.println("debug--2");
		ExecutorService service =  Executors.newSingleThreadExecutor();
		System.out.println("debug--3");

		Future<Integer> future = service.submit(callableObj);
		System.out.println("debug--4");

		Integer result=0;
		System.out.println("debug--5");

		try {
			System.out.println("debug--6");

			result = future.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("Sum = "+result);
	}
}