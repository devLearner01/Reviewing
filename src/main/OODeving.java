package main;

public class OODeving {

	public static void OODeving() {

		Hamburguer baseHamburguer = new Hamburguer( RollType.WHITE_BREAD, Meat.COW, 5);
		baseHamburguer.addAddition( Addition.EGG );
		baseHamburguer.addAddition( Addition.CHEESE );
		baseHamburguer.addAddition( Addition.CARROT );
		baseHamburguer.addAddition( Addition.EXTRA_SAUCE );
		baseHamburguer.printAdditionList();
		System.out.println( "base price: " + baseHamburguer.getBasePrice());
		baseHamburguer.calculateFinalPrice();

		HealthyBurguer healthyBurguer = new HealthyBurguer( RollType.DARK_BREAD, Meat.COW, 4 );
		healthyBurguer.addAddition( Addition.EGG );
		healthyBurguer.addAddition( Addition.CHEESE );
		healthyBurguer.addAddition( Addition.CARROT );
		healthyBurguer.addAddition( Addition.EXTRA_SAUCE );
		healthyBurguer.addAddition( Addition.HAM );
		healthyBurguer.addAddition( Addition.TOMATO);
		healthyBurguer.printAdditionList();
		System.out.println("base price: " + healthyBurguer.getBasePrice());
		healthyBurguer.calculateFinalPrice();

		DeluxeBurguer deluxeBurguer = new DeluxeBurguer( RollType.WHITE_BREAD, Meat.COW, 8 );
		deluxeBurguer.printAdditionList();
		deluxeBurguer.addAddition( Addition.EGG );
		deluxeBurguer.printAdditionList();
		System.out.println("base price: " + deluxeBurguer.getBasePrice());
		deluxeBurguer.calculateFinalPrice();

	}
}
