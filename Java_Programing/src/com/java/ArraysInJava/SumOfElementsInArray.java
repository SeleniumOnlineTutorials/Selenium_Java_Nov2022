package com.java.ArraysInJava;

public class SumOfElementsInArray {
	
	int x[]={2,3,4,12,34,5};
	public static void main(String[] args) {
		SumOfElementsInArray obj=new SumOfElementsInArray();
		
		int len=obj.x.length;
		int sum=0;
		for(int i=0;i<=len-1;i++){
			sum=sum+obj.x[i];
		}
		System.out.println(sum);
	}
}
