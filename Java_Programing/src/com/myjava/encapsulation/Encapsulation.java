package com.myjava.encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.setX(10);
		//obj.setY(34);
		obj.setS("Encapsulation");
		//String s=obj.getS();
		System.out.println(obj.getS());
		System.out.println(obj.getX());
		System.out.println(obj.getY());
		
		
	}
	
}
