package com.debuggerdemo.example.one;

/**
 * Example One aims to shows the concepts of stack trace
 * 
 * 
 * Setting a breakpoint on the nullString declaration
 * Illustrate a simple breakpoint
 * 
 * @author kennyli
 * 
 */
public class ExampleOneNoTryCatch {

	public static void main(String[] args) throws Throwable {
		
		int tempValue = 6;
		System.out.println("Temp Value :"+ tempValue);
		
		String nullString = null;
		//System.out.println("Length of String :" + nullString.length());
		
		
			Throwable t = new NullPointerException();
			throw t;
			
			
		
		
		

	}
}
