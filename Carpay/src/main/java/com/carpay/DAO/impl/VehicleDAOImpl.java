package com.carpay.DAO.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carpay.DAO.VehicleDAO;
import com.carpay.Domain.Vehicle;
import com.carpay.Domain.VehiclePK;

@Service
@Repository
public class VehicleDAOImpl implements VehicleDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	//@Autowired
	//private DataSourceTransactionManager transactionManager;

	@Override
	@Transactional
	public Vehicle getVehicleByVIN(String vin) {
		if (vin == null) return null;
		VehiclePK vehiclePK = new VehiclePK();
		vehiclePK.setVin(vin);
		vehiclePK.setDealerId("1");
		Vehicle vehicle = (Vehicle)sessionFactory.getCurrentSession().get(Vehicle.class, vehiclePK);
		return vehicle;
	}

	@Override
	public void updateVehicle(Vehicle vehicle) {
		sessionFactory.getCurrentSession().save(vehicle);
		
	}

}
