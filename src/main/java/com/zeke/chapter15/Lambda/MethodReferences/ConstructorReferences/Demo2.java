package com.zeke.chapter15.Lambda.MethodReferences.ConstructorReferences;

public class Demo2 {
	/*A factory method for class objects. The class must have
	 a constructor that takes one parameter of type T.
	 R specifies the type of object being created
	 */
	
	static <R,T> R MyClassFactory(MyFunc2<R,T> cons, T v) {
		return cons.func(v);
	}
	
	public static void main(String[] args) {
		/* Create a reference to a MyClass constructor
		 * In this case, new refers to the constructor that
		 * take an argument
		 */
		MyFunc2<MyClass2<Double>, Double> myClassCons = MyClass2<Double>::new;
		
		//create an isntance of MyClass2 by use of the factory method
		
		MyClass2<Double> mc = MyClassFactory(myClassCons, 100.1);
		
		//USE THE INSTACE OF MY CLASS JUST CREATED
		
		System.out.println("Val for mc is " + mc.getVal());
		
		//now create a different class by the use of myClassFactory
		MyFunc2<MyClass2NoGen, String> myClassCons2 = MyClass2NoGen::new;
		
		//create an instance of MyClass2NoGen by use of the factory method
		
		MyClass2NoGen mc2 = MyClassFactory(myClassCons2, "Lambda");
		
		System.out.println(mc2.getStr());
	}
}
