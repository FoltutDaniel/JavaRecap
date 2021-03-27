package com.zeke.chapter15.Lambda.PassingLambdaExpressionsAsArguments;

public class ArgumentDemo {
	
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "Lambdas add power to Java";
		String outStr;
		
		outStr = stringOp((str) -> str.toUpperCase(), inStr);
		
		System.out.println("To upper case: " + outStr);
		
		outStr = stringOp((str) -> {
			
			String result = "";
			for(int i = 0; i < str.length(); i++) {
				result = str.charAt(i) + result;
			}
			return result;
		
		}
		, inStr);
		
		System.out.println("Reverse: " + outStr);
		
		outStr = stringOp((str) -> {
			String result = "";
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) != ' ') {
					result += str.charAt(i);
				}
			}
			return result;
		}, inStr);
		
		System.out.println("No spaces: " + outStr);
	}
}
