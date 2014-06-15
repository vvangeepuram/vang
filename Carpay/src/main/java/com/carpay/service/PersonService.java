package com.carpay.service;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.carpay.Domain.Person;

/**Service for processing person
 * 
 * @author praveen
 *
 */

public class PersonService {
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	/**Retrieves all persons
	 * return a list of persons
	 */
	public List<Person> getAll() {
		
		//Retrieve session for hibernate
		Session session = sessionFactory.getCurrentSession();
		
		//Create a Hibernate query
		Query query = session.createQuery("FROM Person");
		
		//Retrive all
		return query.list();
	}
	
	public Person get(Integer id) {
		//Retrive session from hibernate
		Session session = sessionFactory.getCurrentSession();
		
		//Retrieve existing person first
		Person person = (Person) session.get(Person.class, id);
		
		return person;
		
	}
	/**
	 * Adds a new Person
	 * @param person
	 */
	
	public void add(Person person) {
		Session session = sessionFactory.getCurrentSession();
		
		//Save
		session.save(person);
	}
	
	
	

}
