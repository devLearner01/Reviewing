package main;

import java.util.Random;

public class BankAccount {

	private int accNumber;
	private double balance;
	private String customerName;
	private String eMail;
	private String phoneNr;

	public BankAccount() {

		Random rand = new Random(  );
		this.accNumber = rand.nextInt();
		this.balance = 0;
		this.customerName = "";
		this.eMail = "";
		this.phoneNr = "";
	}

	/**
	 * allow the customer to deposit funds (this should increment the balance field).
	 * @param amount
	 */
	public void depositFunds(double amount){
		this.balance += amount;
		System.out.println("new balance: " + this.balance);
	}

	/**
	 *
	 *  allow the customer to withdraw funds. This should deduct from the balance field,
	 * 	but not allow the withdrawal to complete if their are insufficient funds.
	 *	You will want to create various code in the Main class (the one created by IntelliJ) to
	 *	confirm your code is working.
	 * @param amount
	 */
	public void withdrawFunds(double amount){

		if(amount <= this.balance){
			this.balance -= amount;
			System.out.println("new balance: " + this.balance);
		}
		else{
			System.out.println("Insufficient funds.");
		}
	}

	public double getAccNumber() {
		return accNumber;
	}

	public void setAccNumber( int accNumber ) {
		this.accNumber = accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance( double balance ) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName( String customerName ) {
		this.customerName = customerName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail( String eMail ) {
		this.eMail = eMail;
	}

	public String getPhoneNr() {
		return phoneNr;
	}

	public void setPhoneNr( String phoneNr ) {
		this.phoneNr = phoneNr;
	}
}
