package com.myjava.exceptions;

import com.myjava.customExceptions.AgeValidationException;

public class AgeValidation {
	
	public void agevalidate(int age) throws AgeValidationException{
		
		if(age<18)
		{
			throw new AgeValidationException("person is below 18");
			//System.out.println("person is below 18");
		}
	}

}
