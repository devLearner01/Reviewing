package main;

public class Printer {

	private int tonerLevel;
	private int nrOfPagesPrinted;
	private boolean isDuplex;

	public Printer( ) {	}

	public void fillUpTonner(int pretendedFillLevel){
		if(pretendedFillLevel <= 100)
			this.tonerLevel = pretendedFillLevel;
		System.out.println("You cannot fill the toner to more than 100%");
	}

	public void printPage (){
		this.nrOfPagesPrinted +=1;
	}

	public int showTonnerLevel() {
		return this.getTonerLevel();
	}

	public int howManyPagesPrinted() {
		return this.getNrOfPagesPrinted();
	}



	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getNrOfPagesPrinted() {
		return nrOfPagesPrinted;
	}

	public boolean isDuplex() {
		return isDuplex;
	}
}
