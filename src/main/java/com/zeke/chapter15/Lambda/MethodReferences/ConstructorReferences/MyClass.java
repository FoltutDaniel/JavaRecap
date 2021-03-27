package com.zeke.chapter15.Lambda.MethodReferences.ConstructorReferences;

public class MyClass {
	private int val;
	
	//this constructor takes an argument
	public MyClass(int v) {
		val = v;
	}
	
	//default
	public MyClass() {
		val = 0;
	}
	
	public int getVal() {
		return val;
	}
}
