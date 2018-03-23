package main;

public class Planet extends HeavenlyBody4SetsAndMaps {

	public Planet(String name, double orbitalPeriod, BodyType bodyType){
		super(name, orbitalPeriod, BodyType.PLANET);
	}

	@Override
	public boolean addSatellite( HeavenlyBody4SetsAndMaps moon ) {
		if(moon.getBodyType().equals( BodyType.MOON )){
			System.out.println("moon added");
			return super.addSatellite( moon );
		}
		else {
			System.out.println("can only add sattelites that are Moon to any planet");
			return false;
		}
	}
}
