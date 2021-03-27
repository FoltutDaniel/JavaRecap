package com.zeke.chapter14.Generics.Introduction;

//A simple generic class
//Here, T is a type parameter that 
//will be replaced with a real type
// when an object of type Gen is created
public class Gen<T> {
	T ob; //declare an object of type T
	
	//pass the constructor a refrence to
	//an ojbect of type T
	
	Gen(T o){
		ob = o;
	}
	
	//return ob
	
	public T getOb() {
		return ob;
	}
	
	// show type of T
	
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}
