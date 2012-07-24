package com.debuggerdemo.example.one;

public class ExampleOneWithTryCatch {
	public static void main(String[] args) {

		try {
			String nullString = null;
			System.out.println("Length of String :" + nullString.length());
		} catch (NullPointerException npe) {
			System.out.println("Null Pointer is catch");
		}

	}
	
}
