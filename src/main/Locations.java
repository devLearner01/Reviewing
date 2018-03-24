package main;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location4Immutabling>{

	private static Map<Integer, Location4Immutabling> locations = new HashMap<Integer, Location4Immutabling>();

	public static void main(String[] args) throws IOException {
		try(FileWriter locFile = new FileWriter("locations.txt");
				FileWriter dirFile = new FileWriter("directions.txt")) {
			for(Location4Immutabling location : locations.values()) {
				locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
				for(String direction : location.getExits().keySet()) {
					dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
				}
			}
		}
		//        FileWriter locFile = null;
		//        try {
		//            locFile = new FileWriter("locations.txt");
		//            for(Location location : locations.values()) {
		//                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
		//            }
		//        } finally {
		//            System.out.println("in finally block");
		//            if (locFile != null) {
		//                System.out.println("Attempting to close locfile");
		//                locFile.close();
		//            }
		//        }
	}

	static {

		try ( Scanner scanner1 = new Scanner( new FileReader( "locations_big.txt" ) );
				Scanner scanner2 = new Scanner( new BufferedReader( new FileReader( "directions_big.txt" ) ) ) ) {
			//locations
			scanner1.useDelimiter( "," );
			while ( scanner1.hasNextLine() ) {
				int loc = scanner1.nextInt();
				scanner1.skip( scanner1.delimiter() );
				String description = scanner1.nextLine();
				System.out.println( "Imported loc: " + loc + ": " + description );
				Map<String, Integer> tempExit = new HashMap<>();
				locations.put( loc, new Location4Immutabling( loc, description, tempExit ) );
			}
			//exits
			scanner2.useDelimiter( "," );
			while ( scanner2.hasNextLine() ) {
				String input = scanner2.nextLine();
				String[] data = input.split( "," );
				int loc = Integer.parseInt( data[0] );
				String direction = data[1];
				int destination = Integer.parseInt( data[2] );

				System.out.println( loc + ": " + direction + ": " + destination );
				Location4Immutabling location = locations.get( loc );
				location.addExit( direction, destination );
			}
		} catch ( FileNotFoundException e ) {
			e.printStackTrace();
		}
	}


		@Override
	public int size() {
		return locations.size();
	}

	@Override
	public boolean isEmpty() {
		return locations.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return locations.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return locations.containsValue(value);
	}

	@Override
	public Location4Immutabling get(Object key) {
		return locations.get(key);
	}

	@Override
	public Location4Immutabling put(Integer key, Location4Immutabling value) {
		return locations.put(key, value);
	}

	@Override
	public Location4Immutabling remove(Object key) {
		return locations.remove(key);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends Location4Immutabling> m) {

	}

	@Override
	public void clear() {
		locations.clear();

	}

	@Override
	public Set<Integer> keySet() {
		return locations.keySet();
	}

	@Override
	public Collection<Location4Immutabling> values() {
		return locations.values();
	}

	@Override
	public Set<Entry<Integer, Location4Immutabling>> entrySet() {
		return locations.entrySet();
	}
}
