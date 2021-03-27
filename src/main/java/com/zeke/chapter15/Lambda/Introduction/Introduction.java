package com.zeke.chapter15.Lambda.Introduction;
import java.lang.Math;

public class Introduction {
	public static void main(String[] args) {
		MyNumber myNumber;
		myNumber = () -> 123.45;
		System.out.println(myNumber.getValue());
		
		myNumber = () -> Math.random() * 100;
		System.out.println("random value " + myNumber.getValue());
		
		NumeriTest isEven = (n) -> (n % 2) == 0;
		
		if(isEven.test(10))
			System.out.println("10 is even");
		if(!isEven.test(9))
			System.out.println("9 is not even");
		
		NumeriTest isNonNeg = (n) -> n >= 0;
		
		if(isNonNeg.test(10))
			System.out.println("10 is not negative");
		if(!isNonNeg.test(-2))
			System.out.println("-2 is negative");
		
		NumericFunc numericFact = (n) -> {
			int result = 1;
			
			for(int i=1; i <= n; i++){
				result = result * i;
			}
				
			return result;
		};
		
		System.out.println("Factorial of 3 = " + numericFact.func(3));
		System.out.println("Factorial of 5 = " + numericFact.func(5));
		
		
	}
}
