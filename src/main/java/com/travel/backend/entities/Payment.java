package com.travel.backend.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int userId;
	private Double totalAmount;
	private Date paymentDate;
	private String cardNumber;
	private String pin;
	private String expiryDate;
	private String accountHolder;

	public Payment() {
		super();
	}

	public Payment(int userId, Double totalAmount, String cardNumber, String pin, String expiryDate) {
		super();
		this.userId = userId;
		this.totalAmount = totalAmount;
		this.cardNumber = cardNumber;
		this.pin = pin;
		this.expiryDate = expiryDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", userId=" + userId + ", totalAmount=" + totalAmount + ", paymentDate="
				+ paymentDate + ", cardNumber=" + cardNumber + ", pin=" + pin + ", expiryDate=" + expiryDate
				+ ", accountHolder=" + accountHolder + "]";
	}

	
}
