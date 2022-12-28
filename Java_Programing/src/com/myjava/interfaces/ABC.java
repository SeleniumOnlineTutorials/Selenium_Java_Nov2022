package com.myjava.interfaces;

public class ABC implements MyInterface{

	@Override
	public void m1() {
		System.out.println("M1 method");
	}

	@Override
	public void m2() {
		System.out.println("M2 method");
	}
	
	public static void main(String[] args) {
	//	MyInterface o=new MyInterface();
		ABC obj=new ABC();
		obj.m1();
		obj.m2();
		System.out.println(x);
		System.out.println(MyInterface.x);
		System.out.println(ABC.x);
	}
	
	
	

}
