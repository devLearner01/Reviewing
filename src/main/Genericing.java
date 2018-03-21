package main;

public class Genericing {
	public static void genericing() {

		League<FootballTeam> footballLeague = new League( "FootballLeague");
		footballLeague.getTable().addTeam( new FootballTeam( "ronaldos", "football" ) );
		footballLeague.getTable().addTeam( new FootballTeam( "messis", "football" ) );
		footballLeague.getTable().getTeamByName( "ronaldos" ).setPoints( 100 );
		footballLeague.getTable().getTeamByName( "messis" ).setPoints( 50 );
		footballLeague.getTable().print();

		League<BaseballTeam> baseballLeague = new League( "BaseballLeague");
		baseballLeague.getTable().addTeam( new BaseballTeam( "johns", "baseball" ) );
		baseballLeague.getTable().addTeam( new BaseballTeam( "peters", "baseball" ) );
		baseballLeague.getTable().getTeamByName( "johns" ).setPoints( 222 );
		baseballLeague.getTable().getTeamByName( "peters" ).setPoints( 333 );
		baseballLeague.getTable().print();

	}
}
