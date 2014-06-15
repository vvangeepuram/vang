package com.carpay.DAO;

import com.carpay.Domain.Person;

public interface PersonDAO {
	
	void savePerson(Person customer);
	Integer findById(Integer id);
	

}
