package main;

import java.util.Scanner;

public class Switching {

	public static void switching(){

		System.out.println("Please enter a choice from A to E");
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		char option = input.charAt(0);

		switch (option) {

		case 'A':
			System.out.println("You chose A");
			break;
		case 'B':
			System.out.println("You chose B");
			break;
		case 'C':
			System.out.println("You chose C");
			break;
		case 'D':
			System.out.println("You chose D");
			break;
		case 'E':
			System.out.println("You chose E");
			break;
		default:
			System.out.println("Choose a valid option.");

		}
	}
}
