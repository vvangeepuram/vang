package com.carpay.Domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name="deposit")
@Component
@Scope("session")
public class Deposit extends CarPayEntity implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="status")
	private String status;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="cancelledAt")
	private Date cancelledAt;
	
	@Column(name="acceptedAt")
	private Date acceptedAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getCancelledAt() {
		return cancelledAt;
	}

	public void setCancelledAt(Date cancelledAt) {
		this.cancelledAt = cancelledAt;
	}

	public Date getAcceptedAt() {
		return acceptedAt;
	}

	public void setAcceptedAt(Date acceptedAt) {
		this.acceptedAt = acceptedAt;
	}
	
	
	
	
	
	
	

}
