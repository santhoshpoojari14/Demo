package com.demo.jaxws.service;
import com.demo.jaxws.beans.Person;

public interface PersonService {

	public boolean addPerson(Person p);
	
	public boolean deletePerson(Person p);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();
	public Person update(Person p);
}