package main;

public class Car extends Vehicle {

	private int gear;
	private int speed;
	private boolean isMoving;
	private boolean engine;
	private int nrOfCylinders;
	private int nrOfWheels;
	private String name;




	public Car() {
		super();
	}

	public Car( int nrOfCylinders, String name ) {
		super( TypeOfVehicle.CAR );
		this.nrOfWheels = 4;
		this.engine = true;
		this.nrOfCylinders = nrOfCylinders;
		this.name = name;
	}

	public Car( int nrOfWheels ) {
		super( TypeOfVehicle.CAR );
		this.nrOfWheels = nrOfWheels;
	}

	public Car( Enum typeOfVehicle ) {
		super( typeOfVehicle );
	}

	public Car( Enum typeOfVehicle, int numberOfWheels, int gear, int speed, boolean isMoving ) {
		super( typeOfVehicle );
		this.nrOfWheels = numberOfWheels;
		gear = gear;
		speed = speed;
		this.isMoving = isMoving;
	}


	public void startEngine(){
		if(!engine)
			engine = true;
		System.out.println("Engine started");
	}

	public void accelerate(){
		if(engine) {
			this.isMoving = true;
			this.speed +=5;
			System.out.println("accelerated by 5");
		}
		System.out.println("cannot accelerate a stopped engine");
	}

	public void brake(){
		if(this.isMoving) {
			this.speed -= 5;
			System.out.println("decreased speed by 5");
		}
		System.out.println("cannot brake a non-moving car");
	}

	public void stopEngine(){
		if(this.isEngine() && this.speed == 0) {
			this.isMoving = false;
			this.engine = false;
			System.out.println("engine stoped");
		}
		System.out.println("engine was already stopped");
	}

	public int getGear() {
		return gear;
	}

	public void setGear( int gear ) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed( int speed ) {
		this.speed = speed;
	}

	public boolean isMoving() {
		return isMoving;
	}

	public void setMoving( boolean moving ) {
		isMoving = moving;
	}

	public boolean isEngine() {
		return engine;
	}

	public void setEngine( boolean engine ) {
		this.engine = engine;
	}

	public int getNrOfCylinders() {
		return nrOfCylinders;
	}

	public void setNrOfCylinders( int nrOfCylinders ) {
		this.nrOfCylinders = nrOfCylinders;
	}

	public int getNrOfWheels() {
		return nrOfWheels;
	}

	public void setNrOfWheels( int nrOfWheels ) {
		this.nrOfWheels = nrOfWheels;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}
}
