package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetsAndMaps {

	private static Map<String, HeavenlyBody4SetsAndMaps> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody4SetsAndMaps> planets = new HashSet<>();

	public static void setsAndMaps() {

		/**
		 * almost all of this isn't my code. this code is from tom buchalka. i'm using this for learning purposes.
		 */
		HeavenlyBody4SetsAndMaps temp = new HeavenlyBody4SetsAndMaps("Mercury", 88, BodyType.PLANET);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody4SetsAndMaps("Venus", 225, BodyType.PLANET);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody4SetsAndMaps("Earth", 365, BodyType.PLANET);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		Planet tempPlanet = new Planet("BeautifulPlanet", 27, BodyType.PLANET);
		solarSystem.put(tempPlanet.getName(), tempPlanet);
		tempPlanet.addSatellite(tempPlanet);

		temp = new HeavenlyBody4SetsAndMaps("Mars", 687, BodyType.PLANET);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		HeavenlyBody4SetsAndMaps tempMoon = new HeavenlyBody4SetsAndMaps("Deimos", 1.3, BodyType.MOON);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addSatellite(tempMoon); // temp is still Mars

		tempMoon = new HeavenlyBody4SetsAndMaps("Phobos", 0.3, BodyType.MOON);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addSatellite(tempMoon); // temp is still Mars

		temp = new HeavenlyBody4SetsAndMaps("Jupiter", 4332, BodyType.PLANET);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		tempMoon = new HeavenlyBody4SetsAndMaps("Io", 1.8, BodyType.MOON);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addSatellite(tempMoon); // temp is still Jupiter

		tempMoon = new HeavenlyBody4SetsAndMaps("Europa", 3.5, BodyType.MOON);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addSatellite(tempMoon); // temp is still Jupiter

		tempMoon = new HeavenlyBody4SetsAndMaps("Ganymede", 7.1, BodyType.MOON);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addSatellite(tempMoon); // temp is still Jupiter

		tempMoon = new HeavenlyBody4SetsAndMaps("Callisto", 16.7,  BodyType.MOON);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addSatellite(tempMoon); // temp is still Jupiter

		temp = new HeavenlyBody4SetsAndMaps("Saturn", 10759, BodyType.PLANET);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody4SetsAndMaps("Uranus", 30660, BodyType.PLANET);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody4SetsAndMaps("Neptune", 165, BodyType.PLANET);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody4SetsAndMaps("Pluto", 248, BodyType.PLANET);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		System.out.println("Planets");
		for(HeavenlyBody4SetsAndMaps planet : planets) {
			System.out.println("\t" + planet.getName());
		}

		HeavenlyBody4SetsAndMaps body = solarSystem.get("Mars");
		System.out.println("Moons of " + body.getName());
		for(HeavenlyBody4SetsAndMaps jupiterMoon: body.getSatellites()) {
			System.out.println("\t" + jupiterMoon.getName());
		}

		Set<HeavenlyBody4SetsAndMaps> moons = new HashSet<>();
		for(HeavenlyBody4SetsAndMaps planet : planets) {
			moons.addAll(planet.getSatellites());
		}

		System.out.println("All Moons");
		for(HeavenlyBody4SetsAndMaps moon : moons) {
			System.out.println("\t" + moon.getName());
		}

		HeavenlyBody4SetsAndMaps pluto = new HeavenlyBody4SetsAndMaps("Pluto", 842, BodyType.PLANET);
		planets.add(pluto);

		for(HeavenlyBody4SetsAndMaps planet : planets) {
			System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
		}

		Object o = new Object();
		o.equals(o);
		"pluto".equals("");

	}
}
