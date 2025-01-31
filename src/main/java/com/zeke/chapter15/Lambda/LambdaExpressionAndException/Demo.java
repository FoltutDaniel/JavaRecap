package com.zeke.chapter15.Lambda.LambdaExpressionAndException;

public class Demo {
	
	public static void main(String[] args) throws EmptyArrayException {
		double[] values = { 1.0, 2.0, 3.0, 4.0};
		
		//this block lambda computes the average of an array of doubles
		
		DoubleNumericArrayFunc average = (n) -> {
			double sum = 0;
			
			if(n.length == 0)
				throw new EmptyArrayException();
			
			for(int i = 0; i < n.length; i++) {
				sum += n[i];
			}
			return sum / n.length;
		};
		
		System.out.println("The average for hardcoded: " + average.func(values));
		
		System.out.println("Exception test " + average.func(new double[0]));
	}
}
