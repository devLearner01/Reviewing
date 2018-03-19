package main;

public class Encapsulating {



	public static void encapsulating(){

		Printer printer = new Printer();

		printer.fillUpTonner( 90 );
		int tonnerLevel = printer.showTonnerLevel();
		System.out.println("tonnerlevel: "+ tonnerLevel);

		printer.printPage();
		int pagesPrinted = printer.howManyPagesPrinted();
		System.out.println("pagesPrinted: "+ pagesPrinted);
	}
}
