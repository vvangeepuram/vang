package com.carpay.DAO;

import com.carpay.Domain.Vehicle;

public interface VehicleDAO {
	
    Vehicle getVehicleByVIN(String vin);
    
    void updateVehicle(Vehicle vehicle);
    

}
