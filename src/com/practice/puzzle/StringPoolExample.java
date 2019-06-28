package com.practice.puzzle;

public class StringPoolExample {

	public static void main(String[] args) {
		StringPoolExample p = new StringPoolExample();
		p.start();
	}

	void start() {
		String s1 = "slip";
		String s2 = fix(s1);
		System.out.println(s1 + " " + s2);
	}

	String fix(String s1) {
		s1 = s1 + "stream";
		System.out.print(s1 + " ");
		return "stream";
	}
}
