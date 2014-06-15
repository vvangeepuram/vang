package com.carpay.Domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payment_card")
public class PaymentCard extends CarPayEntity implements Serializable{
	//person can have many payment cards
	//person to card -- many to one
	//card to person -- one to many
	
	@ManyToOne
	Person person;
	
	@Id
	@GeneratedValue
	@Column(name = "card_id")
	private Integer cardId;
	
	@Column(name = "card_type")
	private String cardType;

	@Column(name = "ccnum")
	private String ccNum;
	
	@Column(name = "postal_code")
	private String postalCode;
	
	@Column(name = "exp_date")
	private String expDate;

    private String cvv;
    
    @Column(name="clientIP")
    private String clientIP;
    
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCcNum() {
		return ccNum;
	}
	public void setCcNum(String ccNum) {
		int lastDigit = Integer.parseInt(ccNum, ccNum.length()-1);
		
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getClientIP() {
		return clientIP;
	}
	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}
	
	//method to insert only last digit of the cc number
	private int beforeInsert() {
		int lastDigit = Integer.parseInt(ccNum,ccNum.length()-1);
		return lastDigit;
		
	}
	
	
	

}
