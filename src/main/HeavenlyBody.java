package main;

import java.util.HashSet;
import java.util.Set;

/**
 * this isn't my code. this code is from tom buchalka. i'm using this for learning purposes.
 */
public final class HeavenlyBody {

	private final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;

	public HeavenlyBody(String name, double orbitalPeriod) {
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public boolean addMoon(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}

	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
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

		String objName = ((HeavenlyBody) obj).getName();
		return this.name.equals(objName);
	}

	@Override
	public int hashCode() {		//without the hashCode method the Set will think pluto is a diff object resulting in duplication of this object
		System.out.println("hashcode called");
		return this.name.hashCode() + 57;  //could be any other positive nr
	}

}
