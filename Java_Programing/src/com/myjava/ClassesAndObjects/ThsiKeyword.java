package com.myjava.ClassesAndObjects;

public class ThsiKeyword {
	
	int x;
	int y;
	ThsiKeyword(int x, int y){
		this.x=x;
		this.y=y;
	}
	public void sum(int x, int y){
		this.x=x;
		this.y=y;
		System.out.println(this.x+this.y);
	}
	public void sum(){
		System.out.println(x+y);
	}
	public void display(){
		this.sum();
	}
	
	public static void main(String[] args) {
		ThsiKeyword obj=new ThsiKeyword(10,20);
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.sum(24,36);
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.display();
		
	}

}
