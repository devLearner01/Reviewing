package main;

public class Inheriting {

	MyCar myCar = new MyCar(2);

	public static void inheritingAndDrivingMyCar(){

		MyCar myCar = new MyCar(2);
		System.out.println(myCar.getTypeOfVehicle());
		System.out.println(myCar.getNumberOfWings());
		System.out.println(myCar.getSpeed());

	}
}
