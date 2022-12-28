package com.myjava.ClassesAndObjects;

public class CategorizeVariables {
	
	int x;
	int y;
	char c;
	String s;
	
	static float f=0.42542f;
	
	static void display(int x){
		System.out.println("x value: "+x);//+" y Value: "+y+" Character c value: "+c+" String s value: "+s);
	}
	
	public static void main(String[] args) {
		CategorizeVariables obj=new CategorizeVariables();
		System.out.println(obj.x);
		display(obj.x);
		obj.print();
		obj.x=10;
		obj.y=20;
		obj.s="test";
		obj.sum(obj.x,obj.y,obj.s);
				
	}
	
	void print(){
		System.out.println("x value: "+x+" y Value: "+y+" Character c value: "+c+" String s value: "+s);
	}
	
	void sum(int x, int y, String s){
		int x1=x;
		int y1=y;
		String s1=s;
		System.out.println("x value: "+x+" y Value: "+y+" Character c value: "+c+" String s value: "+s);
	}
	
}
