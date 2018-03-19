package main;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

	ArrayList<Contact> contacts;

	public MobilePhone( ) {
		this.contacts = new ArrayList<Contact>(  );
	}

	public void printMenu(){

		System.out.println("Menu of Options:");
		System.out.println("1- Quit");
		System.out.println("2- Print list of contacts");
		System.out.println("3- Add new contact");
		System.out.println("4- Update existing contact");
		System.out.println("5- Remove contact");
		System.out.println("6- Search contact");
	}

	public void usePhone(){

		System.out.println("Please choose from the menu: ");
		printMenu();

		Scanner scan = new Scanner( System.in );
		String option;
		while( (option = scan.nextLine()) != null){

			switch (option){

			case "1":
				System.exit( 0);
				break;

			case "2":
				printListOfContacts();
				break;

			case "3":
				System.out.println("Name: ");
				String name = scan.nextLine();
				System.out.println("PhoneNr.: ");
				String phoneNr = scan.nextLine();

				addNewContact(name, phoneNr);
				break;

			case "4":
				System.out.println("Name: ");
				name = scan.nextLine();
				System.out.println("PhoneNr.: ");
				phoneNr = scan.nextLine();
				update(name, phoneNr);
				break;

			case "5":
				System.out.println("Name: ");
				name = scan.nextLine();
				removeContact(name);
				break;

			case "6":
				System.out.println("Name: ");
				name = scan.nextLine();
				searchContact(name);
				break;

			}
		}
	}

	private Contact searchContact( String name ) {

		for(Contact c: contacts) {
			if ( c.getName().equalsIgnoreCase( name ) ) {
				return c;
			}
		}
		System.out.println("Contact doesn't exist.");
		return null;
	}

	private void removeContact( String name ) {

		Contact c = this.searchContact( name );
		contacts.remove( c );
		System.out.println("Contact removed.");
	}

	private void update( String name, String phoneNr ) {

		Contact c = this.searchContact( name );
		if(c != null) {
			c.setPhoneNr( phoneNr );
			System.out.println("Contact updated.");
		}
	}

	private void addNewContact(String name, String phoneNr) {

		Contact c = this.searchContact( name );
		if(c != null)
			System.out.println("That contact already exists.");
		else{
			Contact newContact = new Contact( name, phoneNr );
			contacts.add( newContact );
			System.out.println("New contact was created.");
		}
	}

	private void printListOfContacts() {

		System.out.println("List of Contacts:");

		for(Contact c: contacts){
			System.out.println("Name: "+ c.getName() + "		Nr: "+c.getPhoneNr());
		}
	}
}
