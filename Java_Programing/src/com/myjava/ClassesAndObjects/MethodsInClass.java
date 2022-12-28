package com.myjava.ClassesAndObjects;

public class MethodsInClass {
	
	int x=10;
	int y=20;
	public static void main(String[] args) {
		MethodsInClass obj=new MethodsInClass();
		obj.sum();
		obj.sub(obj.x,obj.y);
		int a=obj.mul();
		System.out.println(a);
		float f=obj.div(obj.x,obj.y);
		System.out.println(f);
	}
	
	public void sum(){
		System.out.println(x+y);
	}
	public void sub(int x, int y){
		System.out.println(x-y);
	}
	
	int mul(){
		int z=x*y;
		return z;
	}
	public float div(int x, int y){
		float z=x/y;
		return z;
	}
}
