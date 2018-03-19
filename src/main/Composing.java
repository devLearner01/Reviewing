package main;

public class Composing {



	public static void composing(){

		Room room = new Room( 1, 2, RoomType.SLEEP );

		RoomType roomType = room.whichType();
		System.out.println("roomtype: " + roomType);

		Furniture couch = room.getCouch();



	}
}
