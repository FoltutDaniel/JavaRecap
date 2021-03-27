package com.zeke.chapter15.Lambda.MethodReferences.ConstructorReferences;

public class MyClass2NoGen {
	String str;
	
	//A constructor that takes an argument
	MyClass2NoGen(String s) {
		str = s;
	}
	
	//default constructor
	MyClass2NoGen() {
		str = "";
	}
	
	public String getStr() {
		return str;
	}
}
