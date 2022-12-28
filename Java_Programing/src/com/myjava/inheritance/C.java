package com.myjava.inheritance;

public class C extends B{
	 String s="final concept";
	 int x=30;
	void methodC(){
		
		System.out.println("this is Class C");
		super.display();
	}
	
	void display(){
		System.out.println("this is display methos in class C");
	}
	public static void main(String[] args) {
	
		C obj=new C();
		obj.display();
		obj.methodC();
		
		
		
	}
}
