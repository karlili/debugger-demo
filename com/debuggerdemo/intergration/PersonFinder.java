package com.debuggerdemo.intergration;

import com.debuggerdemo.domain.Person;

public class PersonFinder {

	public Person getPerson(){
		Person p = new Person();
		p.setFirstname("Carrie");
		p.setLastname("Li");
		return p;
	}
}
