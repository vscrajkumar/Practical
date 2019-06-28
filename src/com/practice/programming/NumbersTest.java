package com.practice.programming;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

public class NumbersTest {

	static Scanner scanner;

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		 int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
		            11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; 
		 
		  
		 //scanner = new Scanner(System.in);
		 //int number = Integer.parseInt(scanner.next());
		 int number=1952;
		 int reaa= Integer.parseInt(
		            Arrays.stream((number + "")
		                    .split(""))
		                    .sorted((x,y)->y.compareTo(x))
		                    .collect(Collectors.joining()));
		 
		 System.out.println("reaa--"+reaa);
		 Arrays.stream(arr).forEach(e->System.out.print(e + " "));
		 Arrays.stream((number + "")
                 .split("")).collect(Collectors.counting());
		 
		 Stream<String> names = Stream.of("aBc", "d", "ef");
		 System.out.println(names.map(s -> {
				return s.toUpperCase();
			}).collect(Collectors.toList()));
	}

}
