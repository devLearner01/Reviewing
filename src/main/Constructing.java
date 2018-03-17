package main;

import main.BankAccount;

public class Constructing {


	public static void constructingAndChangingBankAccount(){
		BankAccount bankAccount = new BankAccount();
		bankAccount.depositFunds( 100 );
		bankAccount.withdrawFunds( 200 );
		bankAccount.depositFunds( 50 );
		bankAccount.withdrawFunds( 150 );

		VipCustomer vipCustomer = new VipCustomer(  );
		System.out.println(vipCustomer.getName());
		System.out.println(vipCustomer.getCreditLimit());
		System.out.println(vipCustomer.geteMail());
	}
}
