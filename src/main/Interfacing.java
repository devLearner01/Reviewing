package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Interfacing {

	public static void interfacing() {

		Player p1 = new Player("p1", 10);
		System.out.println(p1);
		saveObject( p1 );
		p1.setPoints( 15 );
		System.out.println(p1);
		saveObject( p1 );
		loadObject( p1 );
		System.out.println(p1);
	}

	public static void saveObject(ISaveable object2save){

		for(int i=0; i< object2save.write().size() ;i++){
			System.out.println("saving " + object2save.write().get( i ) );
		}
	}

	public static void loadObject( ISaveable object2load){

		ArrayList<String> values = readValues();
		object2load.read( values );
	}

	public static ArrayList<String> readValues() {
		ArrayList<String> values = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose\n" +
				"1 to enter a string\n" +
				"0 to quit");

		while (!quit) {
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1:
				System.out.print("Enter a string: ");
				String stringInput = scanner.nextLine();
				values.add(index, stringInput);
				index++;
				break;
			}
		}
		return values;
	}
}
