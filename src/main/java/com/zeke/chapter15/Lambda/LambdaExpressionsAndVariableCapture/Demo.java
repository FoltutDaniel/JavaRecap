package com.zeke.chapter15.Lambda.LambdaExpressionsAndVariableCapture;

public class Demo {
	
	public static void main(String[] args) {
		
		// a local variable that can be captured;
		int num = 10;
		
		MyFunc myLambda = (n) -> {
			//this is use is ok for num cuz it's not modifying it
			
			int v = num + n;
			
			//however the following is illegal
			
			//num++;
			
			return v;
		};
		
		//following would also cause an error, because it would remove the effectively final status for num
		//num = 9;
	}
}
