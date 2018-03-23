package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collectioning {

	static Map<Integer, Location> locations = new HashMap<Integer, Location>();
	static Map<String, Direction > possibleDirectionAliases = new HashMap<String, Direction>();

	public static void collectioning() {

		fillDirectionMap();
		locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
		locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
		locations.put(2, new Location(2, "You are at the top of a hill"));
		locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
		locations.put(4, new Location(4, "You are in a valley beside a stream"));
		locations.put(5, new Location(5, "You are in the forest"));

		Scanner scanner = new Scanner(System.in);
		System.out.println("where do you want to go?");
		String input = scanner.nextLine();

		Direction inputedDirection = findOutDirection(input);

		CollectionsPlayer player1 = new CollectionsPlayer();
		player1.moveTo( inputedDirection );

		locations.get(1).addExit(Direction.W, 2);
		locations.get(1).addExit(Direction.E, 3);
		locations.get(1).addExit(Direction.S, 4);
		locations.get(1).addExit(Direction.N, 5);
		//        locations.get(1).addExit("Q", 0);

		locations.get(2).addExit(Direction.N, 5);
		//        locations.get(2).addExit("Q", 0);

		locations.get(3).addExit(Direction.W, 1);
		//        locations.get(3).addExit("Q", 0);

		locations.get(4).addExit(Direction.N, 1);
		locations.get(4).addExit(Direction.W, 2);
		//        locations.get(4).addExit("Q", 0);

		locations.get(5).addExit(Direction.S, 1);
		locations.get(5).addExit(Direction.W, 2);
		//        locations.get(5).addExit("Q", 0);

	}

	private static Direction findOutDirection( String input ) {

		Direction direction = possibleDirectionAliases.get( input );

		if(direction != null)
			return direction;
		else{
			System.out.println("Command not mapped.");
			return null;
		}
	}

	private static void fillDirectionMap() {

		possibleDirectionAliases.put( "Go North" , Direction.N );
		possibleDirectionAliases.put( "Run North" , Direction.N );
		possibleDirectionAliases.put( "North" , Direction.N );
		possibleDirectionAliases.put( "N" , Direction.N );

		possibleDirectionAliases.put( "Go South" , Direction.S );
		possibleDirectionAliases.put( "Run South" , Direction.S );
		possibleDirectionAliases.put( "South" , Direction.S );
		possibleDirectionAliases.put( "S" , Direction.S );

		possibleDirectionAliases.put( "Go East" , Direction.E );
		possibleDirectionAliases.put( "Run East" , Direction.E );
		possibleDirectionAliases.put( "East" , Direction.E );
		possibleDirectionAliases.put( "E" , Direction.E );

		possibleDirectionAliases.put( "Go West" , Direction.W );
		possibleDirectionAliases.put( "Run West" , Direction.W );
		possibleDirectionAliases.put( "West" , Direction.W );
		possibleDirectionAliases.put( "W" , Direction.W );

		possibleDirectionAliases.put( "Q" , Direction.Q );

	}
}
