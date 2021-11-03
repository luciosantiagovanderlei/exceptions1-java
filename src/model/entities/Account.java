package model.entities;


import model.exceptions.DomainException;

public class Account {
	private Integer numberInteger;
	private String holder;
	private Double balance;
	private Double whithdrawLimit;
	
	public Account(Integer numberInteger, String holder, Double balance, Double whithdrawLimit) {		
		this.numberInteger = numberInteger;
		this.holder = holder;
		this.balance = balance;
		this.whithdrawLimit = whithdrawLimit;
	}
	
	public Integer getNumberInteger() {
		return numberInteger;
	}
	public void setNumberInteger(Integer numberInteger) {
		this.numberInteger = numberInteger;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	
	public Double getWhithdrawLimit() {
		return whithdrawLimit;
	}
	public void setWhithdrawLimit(Double whithdrawLimit) {
		this.whithdrawLimit = whithdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	
	}
	
	public void withDraw(Double amount) throws DomainException {
		
		
		if (amount > whithdrawLimit) {
			throw new DomainException("Whithdraw error: the amount exceeds withdraw limit");			
		}
		if (balance - amount < 0) {
			throw new DomainException("Whithdraw error: Not enough balance");
		}
		else {
			balance -= amount;
		}
	}

	@Override
	public String toString() {
		return "Account number: "
				+ numberInteger 
				+ ", holder: " 
				+ holder
				+ ", balance: " 
				+ balance
				+ ", whithdrawLimit: " 
				+ whithdrawLimit;
	}
	
	
}
