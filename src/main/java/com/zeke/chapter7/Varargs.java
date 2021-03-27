package com.zeke.chapter7;


//creating methods with a variable number of arguments
public class Varargs {

	static void vaTest(int ... v) { // v is operated as an array
		for(int i : v) { 	//can have normal params and VARARGS params but varargs have to be at the end
			System.out.println(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		vaTest(10);
		vaTest(20, 30, 40);
		
	}
}
