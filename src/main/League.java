package main;

public class League {

	private LeagueTable table;

	public League( String leagueName ) {
		this.table = new LeagueTable( leagueName );
	}

	public LeagueTable getTable() {
		return table;
	}

	public void setTable( LeagueTable table ) {
		this.table = table;
	}
}
