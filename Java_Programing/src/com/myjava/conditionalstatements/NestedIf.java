package com.myjava.conditionalstatements;

public class NestedIf {
	public static void main(String[] args) {
	int x=12, y=13,z=10;
	int a=x+y;
	int b=y-z;
		if(x%2==0){
			
			if(y>0){
				
				if(z>20){
					System.out.println("nested if is executed successfully till the inner if");
				}
				else{
					if(a<10){
					System.out.println("sum of x and y"+a);
					}
					else if(b<0){
						System.out.println("b is negative number");
					}
				}
			}
		}
		
	}
}
