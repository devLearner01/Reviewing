package main;

/**
 * Models a car that can fly
 */
public class MyCar1 extends Car {

	private int numberOfWings;
	private boolean isFlying;



	public MyCar1() {
		super( 3, "slowCar");
	}

	public MyCar1( int numberOfWings ) {
		super();
		this.numberOfWings = numberOfWings;
	}

	public MyCar1( Enum typeOfVehicle, int numberOfWings, boolean isFlying ) {

		super( typeOfVehicle );
		this.numberOfWings = numberOfWings;
		this.isFlying = isFlying;
	}

	public MyCar1( Enum typeOfVehicle, int numberOfWheels, int gear, int speed, boolean isMoving, int numberOfWings,
			boolean isFlying ) {

		super( typeOfVehicle, numberOfWheels, gear, speed, isMoving );
		this.numberOfWings = numberOfWings;
		this.isFlying = isFlying;
	}


	@Override
	public void accelerate(){
		if(super.isEngine()) {
			super.setMoving( true );
			super.setSpeed( super.getSpeed()+10 );
			System.out.println("accelerated by 10");
		}
		System.out.println("cannot accelerate a stopped engine");
	}

	@Override
	public void brake(){
		if(super.isMoving()) {
			super.setSpeed( super.getSpeed()-10 );
			System.out.println("decreased speed by 10");
		}
		System.out.println("cannot brake a non-moving car");
	}





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
}
