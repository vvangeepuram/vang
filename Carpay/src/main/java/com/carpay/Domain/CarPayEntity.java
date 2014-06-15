package com.carpay.Domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class CarPayEntity {
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_created", nullable = false)
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated", nullable = false)
	private Date lastUpdated;
	
	@PrePersist
	protected void onCreate() {
		dateCreated = lastUpdated = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		lastUpdated = new Date();
	}
	
	public void setDates() {
		if (dateCreated == null) { dateCreated = new Date();}
		lastUpdated = new Date();
	}

}
