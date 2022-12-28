package com.myjava.exceptions;

public class ArithmeticOperations {
	
	
	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=30;
		int result;
		int a[]={1,2,3,4};
	 try{
		 System.out.println(x/y);
		 System.out.println(x+y);
		 System.out.println(x/0);
	 }catch(ArithmeticException e){
		 System.out.println("Exception occured");
		 System.out.println(0/x);
	 }
	 System.out.println(y-z);
	 try{
		 for(int i=0;i<=a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
		// System.out.println(x/0);
	 }catch(Exception ae){
		//ae.getMessage();
		ae.printStackTrace();
	 }
	 finally{
		System.out.println("This finally will execute by default. it wont bother about wether exception occured and got handelled"); 
	 }
	 System.out.println();
	 System.out.println("end of the code");	
	}
	
	
	
}
