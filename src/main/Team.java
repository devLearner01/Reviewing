package main;

public class Team<T> implements Comparable<Team<T>>{

	private String name;
	private int points;

	public Team( String name ) {
		this.name = name;
		this.points = 0;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints( int points ) {
		this.points = points;
	}

	@Override
	public int compareTo( Team<T> other ) {

		if(this.points > other.getPoints())
			return 1;
		else if(this.points < other.getPoints())
			return -1;
		else
			return 0;
	}
}
