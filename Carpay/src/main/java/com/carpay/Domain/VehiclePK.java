package com.carpay.Domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VehiclePK implements Serializable{
	
	@Column(name="vin")
	private String vin;
	
	@Column(name="dealer_id")
    private String dealerId;
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getDealerId() {
		return dealerId;
	}
	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}
	public boolean equals(VehiclePK other) {
		return vin.equals(other.vin) && dealerId.equals(other.dealerId);
	}	
	 
	 

}
