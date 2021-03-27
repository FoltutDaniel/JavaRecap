package com.zeke.chapter15.Lambda.MethodReferences.StaticMethodRef;

public class MethodRefDemo {

	/*this method has a functional interface as type of
	 its first paramter. Thus, it can be passed any instance of that 
	 interface, including a method reference.
	*/
	
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "Lambdas add power to Java";
		String outStr;
		
		// here, a method references to strReverse is passed to stringOp().
		
		//to crate a static method reference,use this general syntax : ClassName::methodName
		outStr = stringOp(MyStringOps::strReverse, inStr);
		
		System.out.println("Original: " + inStr);
		System.out.println("Reversed: " + outStr);
	}
}
