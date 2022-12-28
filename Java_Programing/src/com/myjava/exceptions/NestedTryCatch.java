package com.myjava.exceptions;

import java.io.IOException;

public class NestedTryCatch {
	int x =10;
	public static void main(String[] args) {
		
		NestedTryCatch obj=null;
		
		String s=null;
		try{
			System.out.println(obj.x);
		}
        catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
        catch(Exception e){
        	e.printStackTrace();
		}
		finally{
			
		}
		
		
		
	}

}
