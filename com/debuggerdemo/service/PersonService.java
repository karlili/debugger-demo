package com.debuggerdemo.service;

import com.debuggerdemo.domain.Person;
import com.debuggerdemo.intergration.PersonFinder;

public class PersonService {
	
	PersonFinder personFinder = new PersonFinder();
	public Person getPerson(){
		
		Person p = personFinder.getPerson();
		return p;
	}
}
