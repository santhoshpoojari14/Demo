package com.demo.jaxws.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.demo.jaxws.beans.Person;

public class PersonServiceImpl implements PersonService {

	private static Map<Integer,Person> persons = new HashMap<Integer,Person>();
	
	@Override
	public  boolean addPerson(Person p) 
	{
		if(persons.get(p.getId()) != null) return false;
		persons.put(p.getId(), p);
		return true;
	}

	@Override
	public boolean deletePerson(Person p) 
	{
		int id=p.getId();
		if(persons.get(id) == null)
			return false;
		persons.remove(id);
		return true;
	}
// commit
	@Override
	public Person getPerson(int id) {
		return persons.get(id);
	}

	@Override
	public Person[] getAllPersons() 
	{
		Set<Integer> ids = persons.keySet();
		Person[] p = new Person[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = persons.get(id);
			i++;
		}
		return p;
	}

	@Override
	public Person update(Person p) {
   
         int	id= p.getId();
		Set<Integer> ids = persons.keySet();
		if(ids.contains(id)){
			persons.put(id, p);
		}
		return p;
	}

}