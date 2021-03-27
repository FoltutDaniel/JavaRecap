package com.zeke.chapter15.Lambda.MethodReferences.ConstructorReferences;

public class MyClass2<T> {
	private T val;

	//A constr taht takes an argument
	public MyClass2(T val) {
		this.val = val;
	}
	public MyClass2() {
		val = null;
	}
	
	public T getVal() {
		return val;
	}
	
}
