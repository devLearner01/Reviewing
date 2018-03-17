package main;

public class VipCustomer {

	private String name;
	private double creditLimit;
	private String eMail;

	public VipCustomer() {

		this( "Max Mustermann", 10000.00, "mm@gmail.com");
	}

	public VipCustomer( String name, String eMail ) {
		this( name, 50000, "mm@gmail.com");
	}

	public VipCustomer( String name, double creditLimit, String eMail ) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.eMail = eMail;
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String geteMail() {
		return eMail;
	}
}
