package com.myjava.customExceptions;

public class AgeValidationException extends Exception {
	
	public AgeValidationException(String errorMessage){
	 super(errorMessage);
	}

}
