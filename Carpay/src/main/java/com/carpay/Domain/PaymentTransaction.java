package com.carpay.Domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name="payment_transaction")
@Component
@Scope("session")
public class PaymentTransaction extends CarPayEntity implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="response")
	private String response;
	
	@Column(name="status")
	private String status;
	
	@Column(name="transactionId")
	private String transactionId;
	
	@Column(name="timeStamp")
	private String timeStamp;
	
	@Column(name="version")
	private String version;
	
	@Column(name="build")
	private String build;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="currencyCode")
	private String currencyCode;
	
	@Column(name="avsCode")
	private String avsCode;
	
	@Column(name="cvsResponse")
	private String cvsResponse;
	
	@Column(name="corelationId")
	private String corelationId;
	
	@Column(name="errorCode")
	private String errorCode;
	
	
	
	

}
