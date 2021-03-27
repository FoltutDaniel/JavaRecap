package com.zeke.chapter15.Lambda.LambdaExpressionAndException;

public class EmptyArrayException extends Exception{
	
	public EmptyArrayException() {
		super("Array empty");
	}
}
