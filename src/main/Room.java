package main;

import java.util.List;

public class Room {

	private int nrOfDoors;
	private int nrOfWindows;
	private RoomType roomType;
	private List<Furniture> furniture;

	public Room() {
	}

	public Room( int nrOfDoors, int nrOfWindows, RoomType roomType ) {
		this.nrOfDoors = nrOfDoors;
		this.nrOfWindows = nrOfWindows;
		this.roomType = roomType;
	}


	public Furniture getCouch(){

		if(this.furniture != null) {
			for ( Furniture f : this.furniture ) {
				if ( f.equals( Furniture.COUCH ) ) {
					System.out.println( "Couch found!" );
					return f;
				}
			}
		}
		System.out.println("No couch in this room.");
		return null;
	}

	public RoomType whichType(){
		return this.roomType;
	}


}
