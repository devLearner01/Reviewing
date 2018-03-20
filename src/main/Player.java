package main;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

	private String name;
	private int points;

	public Player() {
	}

	public Player( String name, int points) {
		this.name = name;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints( int points ) {
		this.points = points;
	}

	@Override public String toString() {
		return "Player{" + "name='" + name + '\'' + ", points=" + points + '}';
	}

	@Override
	public List<String> write() {
		List<String> values = new ArrayList<>();
		values.add( 0, this.name );
		values.add( 1, "" + this.points );
		return values;
	}

	public void read( List<String> values ) {
		if(values != null && values.size() > 0){
			this.name = values.get( 0 );
			this.points = Integer.parseInt( values.get( 1 ) );
		}

	}

}
