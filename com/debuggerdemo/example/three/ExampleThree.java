package com.debuggerdemo.example.three;

import com.debuggerdemo.exception.RidiculousException;

/**
 * Example Three aims to illustrates features 
 * for highlighting the variable with value changed.
 * @author kennyli
 *
 */
public class ExampleThree {

	public static void main(String[] args){
		
		Integer intVariable = new Integer(0);
		for (int i=0; i<=5; i++){
			intVariable = i;
			System.out.println("Value of i :"+i);
			
		}
		
		
		String characterString = new String("ABCDEFGHIFKLMNOPQRSTUVWXYZ");
		for (int i=0; i<characterString.length(); i++){
			
			String singleCharacterString = characterString.substring(i, i+1);
			
			System.out.println(singleCharacterString);
			if ("D".equals(singleCharacterString)){
				throw new RidiculousException();
			}
			
		}
		
		
		
	}
}
