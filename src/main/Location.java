package main;

import java.util.HashMap;
import java.util.Map;

public class Location {

	private final int locationID;
	private final String description;
	private final Map<Direction, Integer> exits;

	public Location(int locationID, String description) {
		this.locationID = locationID;
		this.description = description;
		this.exits = new HashMap<Direction, Integer>();
		this.exits.put(Direction.Q, 0);
	}

	public void addExit(Direction direction, int location) {
		exits.put(direction, location);
	}
	public int getLocationID() {
		return locationID;
	}

	public String getDescription() {
		return description;
	}

	public Map<Direction, Integer> getExits() {
		return new HashMap<Direction, Integer>(exits);
	}
}
