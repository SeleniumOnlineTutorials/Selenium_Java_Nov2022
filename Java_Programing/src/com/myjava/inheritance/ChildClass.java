package com.myjava.inheritance;

public class ChildClass extends ParentClass{
	
	public ChildClass(){
		super();
		System.out.println("This is child class constructor");
		
	}
	
	String s="inheritance";
	
	void print(){
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.display();
	}

}
