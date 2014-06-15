package com.carpay.DAO.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carpay.DAO.PersonDAO;
import com.carpay.Domain.Person;

@Service
@Repository
public class PersonDAOImpl implements PersonDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void savePerson(Person customer) {
		customer.setDates();
		sessionFactory.getCurrentSession().save(customer);
	}

	@Override
	@Transactional
	public Integer findById(Integer id) {
		// TODO Auto-generated method stub
		return (Integer) sessionFactory.getCurrentSession().get(Person.class, id);
		
		
	}
	

}
