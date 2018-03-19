package main;

public class Polymorphing {

	public static void polymorphing(){

		Car car = new Car();
		car.startEngine();
		car.accelerate();
		car.brake();
		car.stopEngine();


		MyCar1 myCar1 = new MyCar1(  );
		myCar1.startEngine();
		myCar1.accelerate();
		myCar1.brake();
		myCar1.stopEngine();

		MyCar2 myCar2 = new MyCar2(  );
		myCar2.startEngine();
		myCar2.accelerate();
		myCar2.brake();
		myCar2.stopEngine();



	}
}
