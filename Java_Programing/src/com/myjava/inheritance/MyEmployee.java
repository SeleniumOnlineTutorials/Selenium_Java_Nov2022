package com.myjava.inheritance;

import java.util.Scanner;

public class MyEmployee extends Employee {

	int hikePercentage;

	public static void main(String[] args) {
		MyEmployee obj=new MyEmployee();
		Scanner sc=new Scanner(System.in);
		obj.empName=sc.next();
		obj.organisation=sc.next();
		obj.designation=sc.next();

		//String desg=obj.empDesignation();
		//switch(desg)
		switch(obj.empDesignation().toLowerCase()){

		case "se":
			obj.hikePercentage=10;
			break;
		case "sse":
			obj.hikePercentage=15;
			break;

		case "tl":
			obj.hikePercentage=20;
			break;
		case "pm":
			obj.hikePercentage=25;
			break;

		}
		obj.employeeDetails();
		System.out.println("Hike: "+obj.hikePercentage);

	}

}
