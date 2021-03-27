package com.zeke.chapter7;


//STARTING WITH JDK 10 java supports local variable type inference
//can be used with primitives and reference types
public class LocalVariableTypeInferenceWithReferenceTypes {
	
	
	
	public static void main(String[] args) {
		
		var myStr = "Buna ziua"; //type infered is String
		System.out.println(myStr);
	}

}
