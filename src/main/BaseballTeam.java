package main;

public class BaseballTeam extends Team {

	private String sportsName;

	public BaseballTeam( String teamName ) {
		super( teamName );
	}

	public BaseballTeam( String teamName, String sportsName ) {
		super( teamName );
		this.sportsName = "Baseball";
	}

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName( String sportsName ) {
		this.sportsName = sportsName;
	}
}
