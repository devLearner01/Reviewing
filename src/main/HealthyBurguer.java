package main;

public class HealthyBurguer extends Hamburguer {



	public HealthyBurguer( RollType rollType, Meat meat, float basePrice ) {
		super( rollType, meat, basePrice);
	}


	@Override
	public void addAddition( Addition addition){

		if(super.getAdditionList().size() < 6){
			super.getAdditionList().add( addition );
			System.out.println("Added: " + addition);
		}
		else
			System.out.println("Cannot add more than 6 additions.");
	}

}
