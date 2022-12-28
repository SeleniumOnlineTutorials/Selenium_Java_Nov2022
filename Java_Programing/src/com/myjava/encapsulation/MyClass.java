package com.myjava.encapsulation;

public class MyClass {
	
	//variables and methods of a class should be private
	
	private int x;
	private String s;
	private int y=30;
	
	private void myMethod(){
		System.out.println("ths is my method");
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

}
