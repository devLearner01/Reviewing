package main;

public class Car extends Vehicle {

	private int numberOfWheels;
	private int Gear;
	private int Speed;
	private boolean isMoving;

	public Car() {
		super();
	}

	public Car( Enum typeOfVehicle ) {
		super( typeOfVehicle );
	}

	public Car( Enum typeOfVehicle, int numberOfWheels, int gear, int speed, boolean isMoving ) {
		super( typeOfVehicle );
		this.numberOfWheels = numberOfWheels;
		Gear = gear;
		Speed = speed;
		this.isMoving = isMoving;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels( int numberOfWheels ) {
		this.numberOfWheels = numberOfWheels;
	}

	public int getGear() {
		return Gear;
	}

	public void setGear( int gear ) {
		Gear = gear;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed( int speed ) {
		Speed = speed;
	}

	public boolean isMoving() {
		return isMoving;
	}

	public void setMoving( boolean moving ) {
		isMoving = moving;
	}
}
