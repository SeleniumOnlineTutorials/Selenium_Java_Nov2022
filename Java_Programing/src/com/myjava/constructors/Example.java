package com.myjava.constructors;

public class Example {
	
	int x;
	String s;

	Example(int a, String st){
		x=a;
		s=st;
		System.out.println(x+" "+s);
	}
	Example(){
		x=100;
		s="selenium";
		System.out.println(x+" "+s);
		method();
	}
	
	void method(){
		System.out.println("this is method");
	}

    //only a sing default constructr is allowed
    //we can have any number of constructors but it should differ by number of arguments, type of arguments and order of arguments
	public static void main(String[] args) {
		
		Example ex=new Example(10,"test");
		System.out.println(ex.x+" "+ex.s);
		
		Example ex1=new Example();
		
		
	}

}
