package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueTable<T extends Team> {

	private String name;
	private ArrayList<T> teams = new ArrayList<T>( );

	public LeagueTable( String name) {
		this.name = name;
	}

	public void addTeam(Team team){
		if(teams.contains( team ))return;
		this.teams.add( (T) team );
		System.out.println("added team: "+team.getName());
	}

	public void removeTeam(Team team){
		this.teams.remove( team );
		System.out.println("removed team: "+team.getName());
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public List<T> getTeams() {
		return teams;
	}

	public void setTeams( ArrayList<T> teams ) {
		this.teams = teams;
	}

	public Team getTeamByName(String teamName){

		for(Team t: this.teams){
			if(t.getName().equalsIgnoreCase( teamName )){
				return t;
			}
		}
		System.out.println("couldn't find that team.");
		return null;
	}

	public void print(){
		Collections.sort( teams );
		Collections.reverse( teams );
		for(Team t: teams){
			System.out.println("team: " + t.getName() + "     points: "+t.getPoints());
		}
	}

}
