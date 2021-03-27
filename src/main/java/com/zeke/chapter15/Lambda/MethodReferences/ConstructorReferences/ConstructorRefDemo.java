package com.zeke.chapter15.Lambda.MethodReferences.ConstructorReferences;

public class ConstructorRefDemo {
	
	public static void main(String[] args) {
		/*
		 Create a reference to the MyClass constructor.
		 Beacuse func() in MyFunc takes an argument, new
		 refers to the parametrized constructor in MyClass
		 not the def constructor
		 */
		
		MyFunc myClassCons = MyClass::new;
		
		//create an isntance of MyClass via the constructor reference
		MyClass mc = myClassCons.func(100);
		
		System.out.println("val in mc is " + mc.getVal());
	}
}
