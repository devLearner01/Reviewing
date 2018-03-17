package main;

/**
 * Models a car that can fly
 */
public class MyCar extends Car {

	private int numberOfWings;
	private boolean isFlying;

	public int getNumberOfWings() {
		return numberOfWings;
	}

	public void setNumberOfWings( int numberOfWings ) {
		this.numberOfWings = numberOfWings;
	}

	public boolean isFlying() {
		return isFlying;
	}

	public void setFlying( boolean flying ) {
		isFlying = flying;
	}

	public MyCar() {
		super();
	}

	public MyCar( int numberOfWings ) {
		super();
		this.numberOfWings = numberOfWings;
	}

	public MyCar( Enum typeOfVehicle, int numberOfWings, boolean isFlying ) {

		super( typeOfVehicle );
		this.numberOfWings = numberOfWings;
		this.isFlying = isFlying;
	}

	public MyCar( Enum typeOfVehicle, int numberOfWheels, int gear, int speed, boolean isMoving, int numberOfWings,
			boolean isFlying ) {

		super( typeOfVehicle, numberOfWheels, gear, speed, isMoving );
		this.numberOfWings = numberOfWings;
		this.isFlying = isFlying;
	}
}
