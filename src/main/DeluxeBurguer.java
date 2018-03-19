package main;

public class DeluxeBurguer extends Hamburguer {

	private boolean chips;
	private boolean drink;

	public DeluxeBurguer( RollType rollType, Meat meat, float basePrice ) {
		super(rollType, meat, basePrice);
		this.chips = true;
		this.drink = true;
	}

	@Override
	public void addAddition( Addition addition){

		System.out.println("No additions allowed.");
	}
}
