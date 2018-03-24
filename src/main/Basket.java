package main;

import sun.rmi.server.Activation$ActivationSystemImpl_Stub;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {

	private final String name;
	private final Map<StockItem, Integer> list;

	public Basket( String name) {
		this.name = name;
		this.list = new TreeMap<>();
	}

	public int addToBasket(StockItem item, int quantity){

		if(item!=null && quantity >0){
			int inBasket = list.getOrDefault( item, 0 );
			list.put( item, inBasket + quantity );
			return inBasket;
		}
		return 0;
	}

	public Map<StockItem, Integer> getItems(){
		return Collections.unmodifiableMap( this.list );
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append( System.lineSeparator() );
		sb.append( "Shopping basket " + name + " contains " + list.size() + ( list.size() == 1 ? " item." : "items." ));
		sb.append( System.lineSeparator() );

		double totalCost = 0.0;
		for( Map.Entry<StockItem, Integer> item : list.entrySet()){

			sb.append( item.getKey() + ". " + item.getValue() + " purchased." );
			sb.append( System.lineSeparator() );

			totalCost += item.getKey().getPrice() * item.getValue();
		}
		return sb.append( "Total cost "  + totalCost ).toString();
	}
}
