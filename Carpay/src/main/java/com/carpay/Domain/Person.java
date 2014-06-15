package com.carpay.Domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Entity
@Table(name="contact")
@Component
@Scope("session")
public class Person extends CarPayEntity  implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		List<PaymentCard> paymentCard;


		public Vehicle getVehicle() {
			return vehicle;
		}
		public void setVehicle(Vehicle vehicle) {
			this.vehicle = vehicle;
		}
		@ManyToOne
		@JoinColumns({
		@JoinColumn(name="vin",referencedColumnName="",insertable=false, updatable=false),
		@JoinColumn(name="dealer_id", referencedColumnName="", insertable=false, updatable=false)})
		Vehicle vehicle;
		
		
		@Id
		@GeneratedValue
		@Column(name="id")
		private Integer id;
		
		@Column(name="firstName")
	    private String firstName;
		
		@Column(name="lastName")
	    private String lastName;
		
		@Column(name="email")
	    private String email;
		
		@Column(name="phoneNumber")
		private String phoneNumber;
		
		/*@Column(name="date_created")
		Date dateCreated;
		@Column(name="last_updated")
		Date lastUpdated;*/
		/*
		static constraints = {
			firstName firstName:true, blank:false
			lastName lastName:true, blank:false
			email email:true, blank:false
			phoneNumber phoneNumber:true, blank:false
		}*/
		/*static mapping = {
			table 'contact'
			// this line will disable the version number support required
			// for GORM optimistic locking.  comment out or remove
			// if you want to support locking (recommended, not required)
			version false
			autoTimestamp true
				 
			//maps the columns to the properties in the domain
			columns {
				firstName column:'firstName'
				lastName column:'lastName'
				email column:'email'
				phoneNumber column:'phoneNumber'
				date_created column: 'dateCreated'
				last_updated column: 'lastUpdated'
			}*/
		//}
		
		public String getFirstName() {
			return firstName;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		
	}
		
		
//}


