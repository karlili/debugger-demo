package com.debuggerdemo.example.two;

import com.debuggerdemo.domain.Person;
import com.debuggerdemo.service.PersonService;

/**
 * Example Two aims to shows the sequence of the calling the debugger works
 * @author kennyli
 *
 */
public class ExampleTwo {
	
	public static void main(String[] args){
		
		PersonService personService = new PersonService();
		Person p = personService.getPerson();
		System.out.println(p.toString());
		
		
	}

}
