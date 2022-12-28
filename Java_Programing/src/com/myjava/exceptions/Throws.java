package com.myjava.exceptions;

public class Throws {
	
	void m(int x, int y){
		 System.out.println(x/y);
		 System.out.println(x+y);
		 System.out.println(x/0);
	}
	
 public static void main(String[] args){
	 int x=10;
		int y=20;
		int z=30;
		int result;
		int a[]={1,2,3,4};
		Throws obj=new Throws();
		try{
		obj.m(x, y);
		}catch(Exception e){
			/*System.out.println();
			e.printStackTrace();*/
		}
		finally{
			System.out.println("this is finally block");
		}
		System.out.println(y*z);
 }

}
