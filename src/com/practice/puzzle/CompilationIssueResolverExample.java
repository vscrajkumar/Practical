package com.practice.puzzle;

public class CompilationIssueResolverExample {

	public void someOuterMethod() {
		new Inner();
	}

	public class Inner {
	}

	public static void main(String[] argv) {
		CompilationIssueResolverExample ot = new CompilationIssueResolverExample();
		// Line 10
	}
}
