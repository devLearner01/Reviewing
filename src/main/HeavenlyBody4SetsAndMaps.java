package main;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody4SetsAndMaps {

	private final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody4SetsAndMaps> satellites;
	private final BodyType bodyType;

	public HeavenlyBody4SetsAndMaps( String name, double orbitalPeriod, BodyType bodyType ) {
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.bodyType = bodyType;

		this.satellites = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}


	public boolean addSatellite(HeavenlyBody4SetsAndMaps sat) {
		return this.satellites.add(sat);
	}

	public Set<HeavenlyBody4SetsAndMaps> getSatellites() {
		return new HashSet<>(this.satellites);
	}

	public BodyType getBodyType() {
		return bodyType;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}

		System.out.println("obj.getClass() is " + obj.getClass());
		System.out.println("this.getClass() is " + this.getClass());
		/**
		 * make sure it's the same class, not a subclass of itself.
		 * in this class it could never happen, because the class is final, so it cannot be subclassed, but if it weren't final
		 * this check would be extremely important.
		 */
		if ((obj == null) || (obj.getClass() != this.getClass())) {
			return false;
		}

		String objName = ((HeavenlyBody4SetsAndMaps) obj).getName();
		return this.name.equals(objName);
	}

	@Override
	public int hashCode() {		//without the hashCode method the Set will think pluto is a diff object resulting in duplication of this object
		System.out.println("hashcode called");
		return this.name.hashCode() + 57;  //could be any other positive nr
	}


}
