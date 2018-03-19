package main;

public class Inheriting {

	MyCar1 myCar1 = new MyCar1(2);

	public static void inheritingAndDrivingMyCar(){

		MyCar1 myCar1 = new MyCar1(2);
		System.out.println( myCar1.getTypeOfVehicle());
		System.out.println( myCar1.getNumberOfWings());
		System.out.println( myCar1.getSpeed());

	}
}
