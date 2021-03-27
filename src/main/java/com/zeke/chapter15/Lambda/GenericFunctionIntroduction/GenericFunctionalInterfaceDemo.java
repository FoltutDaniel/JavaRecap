package com.zeke.chapter15.Lambda.GenericFunctionIntroduction;

public class GenericFunctionalInterfaceDemo {
	
	public static void main(String[] args) {

	SomeFunc<String> reverse = (str) ->{
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			result = str.charAt(i) + result;
		}
		
		return result;
	};
	
	System.out.println(reverse.func("dan"));
	
	SomeFunc<Integer> factorial = (n) -> {
		
		int result = 1;
		
		for(int i = 1; i <= n; i++) {
			result = result*i;
		}
		return result;
	};
	
	System.out.println(factorial.func(5));
}

	
}
