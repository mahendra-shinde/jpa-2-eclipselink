package com.mahendra;

import javax.persistence.*;

@Entity
@Table(name="accounts")
public class Account {

	@Id @GeneratedValue
	@Column(name="acc_no")
	private Integer accNumber;
	
	@Column(name="accHolder",length=30)
	private String accHolder;
	
	private double balance;

	public Integer getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(Integer accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
