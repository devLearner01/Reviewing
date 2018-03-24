package main;

public class StockItem implements  Comparable<StockItem>{

	private final String name;
	private double price;
	private int quantityInStock = 0;
	private int reserved = 0;

	public StockItem( String name, double price ) {
		this.name = name;
		this.price = price;
	}


	public StockItem( String name, double price, int quantityInStock ) {
		this.name = name;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice( double price ) {
		if(price > 0.0)
			this.price = price;
	}

	public int availableQuantity(){
		return this.quantityInStock - this.reserved;
	}

	public void adjustStock(int quantity){
		int newQuantity = this.quantityInStock + quantity;
		if(newQuantity >= 0){
			this.quantityInStock = newQuantity;
		}
	}

	public int unreservedStock(int quantity){
		if(quantity <= reserved){
			quantityInStock-=quantity;
			reserved -= quantity;
			return quantity;
		}
		return 0;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + 31; //don't get how to choose the number to be added.
	}

	@Override
	public boolean equals( Object obj ) {

		if(this == obj)
			return true;

		if(obj == null || this.getClass() != obj.getClass())
			return false;

		String objName = ((StockItem)obj).getName();
		return this.name == objName;
	}

	@Override
	public String toString() {
		return "Name:" + this.name + "   Price: "+this.price + "Reserved:   "+this.reserved + ".";
	}

	@Override
	public int compareTo( StockItem o ) {

		if ( this == o )
			return 0;

		if ( o != null )
			return this.name.compareTo( o.getName() );
		else
			throw new NullPointerException(  );
	}
}
