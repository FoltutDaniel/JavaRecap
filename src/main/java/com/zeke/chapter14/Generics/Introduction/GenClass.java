package com.zeke.chapter14.Generics.Introduction;

public class GenClass {
	
	public static void main(String[] args) {
		//create a Gen reference for Integers
		Gen<Integer> iOb;
		
		//Create a Gen<Integer> obj and assign its reference to iOb
		//Notice the use of autoboxing to encapsulate the value 88 within the Integer Object
		
		iOb = new Gen<Integer>(88);
		
		//show the type of data used by iOb
		
		iOb.showType();
		
		int v = iOb.getOb();
		
		System.out.println("Value: " + v);
		
		//create a Gen object for String
		
		Gen<String> strOb = new	Gen<String>("Generics Test)");
		
		strOb.showType();
		
		//get value no cast needed
		
		String str = strOb.getOb();
		System.out.println("Str: " + str);
		
	}
}
