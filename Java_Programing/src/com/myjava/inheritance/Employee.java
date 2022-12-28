package com.myjava.inheritance;

public class Employee {
	
	String empName;
	String designation;
	String organisation;
	
	/*Employee(String eName, String desg, String org){
		empName=eName;
		designation=desg;
		organisation=org;
	}*/
	
	public void employeeDetails(){
		System.out.println("Name: "+empName+" Designation: "+designation+" Organisation: "+organisation);
	}
	
	public String empDesignation(){
		return designation;
	}
	
}
