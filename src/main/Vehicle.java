package main;

public class Vehicle {

	private Enum typeOfVehicle;

	public Vehicle() {
		this(TypeOfVehicle.UNKNOWN);
	}

	public Vehicle( Enum typeOfVehicle ) {
		this.typeOfVehicle = typeOfVehicle;
	}

	public Enum getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle( Enum typeOfVehicle ) {
		this.typeOfVehicle = typeOfVehicle;
	}

}
