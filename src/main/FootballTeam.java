package main;

public class FootballTeam extends Team{

	private String sportsName;

	public FootballTeam( String teamName ) {
		super( teamName );
	}

	public FootballTeam( String teamName, String sportsName ) {
		super( teamName );
		this.sportsName = "Football";
	}

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName( String sportsName ) {
		this.sportsName = sportsName;
	}
}
