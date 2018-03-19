package main;

import java.util.ArrayList;
import java.util.List;

public class Hamburguer {

	private String name;
	private RollType rollType;
	private Meat meat;
	private List<Addition> additionList;
	private float basePrice;
	private float finalPrice;

	public Hamburguer() {

	}

	public Hamburguer( RollType rollType, Meat meat, float basePrice ) {
		this.name = name;
		this.rollType = rollType;
		this.meat = meat;
		this.additionList = new ArrayList<>();
		this.basePrice = basePrice;
	}

	public void addAddition( Addition addition){

		if(additionList.size() < 4){
			this.additionList.add( addition );
			System.out.println("Added: " + addition);
		}
		else
			System.out.println("Cannot add more than 4 additions.");
	}

	public void removeAddition( Addition addition){
		if(additionList.size() > 1){
			this.additionList.remove( addition );
			System.out.println("removed: " + addition);
		}
		System.out.println("No existing additions to be removed.");
	}

	public void printAdditionList(){
		System.out.println("Added additions: ");
		for(Addition a: this.additionList){
			System.out.println( a);
		}
	}

	private float calculateAdditionPrice(){
		float totalAdditionPrice = 0;
		for(Addition a: this.additionList){
			totalAdditionPrice += 0.50;
		}
		return totalAdditionPrice;
	}

	public void calculateFinalPrice(){
		System.out.println("Final Price: " + (this.basePrice + this.calculateAdditionPrice()));
	}

	public float getBasePrice() {
		return basePrice;
	}

	public List<Addition> getAdditionList() {
		return additionList;
	}

	public void setAdditionList( List<Addition> additionList ) {
		this.additionList = additionList;
	}
}
