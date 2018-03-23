package main;

public class CollectionsPlayer {
	static int id = 0;
	Location location;

	public CollectionsPlayer( ) {
		this.id = id++;
		location = Collectioning.locations.get( 0 );
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public main.Location getLocation() {
		return location;
	}

	public void moveTo(Direction inputedDirection){

		switch(this.location.getLocationID()){
		case 0:
			if(inputedDirection.equals( Direction.N ))
				this.location = Collectioning.locations.get( 1 );

			if(inputedDirection.equals( Direction.S ))
				this.location = Collectioning.locations.get( 2 );

			if(inputedDirection.equals( Direction.E ))
				this.location = Collectioning.locations.get( 3 );

			if(inputedDirection.equals( Direction.W ))
				this.location = Collectioning.locations.get( 4 );
			break;
		case 1:
			if(inputedDirection.equals( Direction.N ))
				this.location = Collectioning.locations.get( 2 );

			if(inputedDirection.equals( Direction.S ))
				this.location = Collectioning.locations.get( 3 );

			if(inputedDirection.equals( Direction.E ))
				this.location = Collectioning.locations.get( 4 );

			if(inputedDirection.equals( Direction.W ))
				this.location = Collectioning.locations.get( 5 );
			break;
		case 2:
			if(inputedDirection.equals( Direction.N ))
				this.location = Collectioning.locations.get( 3 );

			if(inputedDirection.equals( Direction.S ))
				this.location = Collectioning.locations.get( 4 );

			if(inputedDirection.equals( Direction.E ))
				this.location = Collectioning.locations.get( 5 );

			if(inputedDirection.equals( Direction.W ))
				this.location = Collectioning.locations.get( 0 );
			break;
		case 3:
			if(inputedDirection.equals( Direction.N ))
				this.location = Collectioning.locations.get( 4 );

			if(inputedDirection.equals( Direction.S ))
				this.location = Collectioning.locations.get( 5 );

			if(inputedDirection.equals( Direction.E ))
				this.location = Collectioning.locations.get( 0 );

			if(inputedDirection.equals( Direction.W ))
				this.location = Collectioning.locations.get( 1 );
			break;
		case 4:
			if(inputedDirection.equals( Direction.N ))
				this.location = Collectioning.locations.get( 5 );

			if(inputedDirection.equals( Direction.S ))
				this.location = Collectioning.locations.get( 0 );

			if(inputedDirection.equals( Direction.E ))
				this.location = Collectioning.locations.get( 1 );

			if(inputedDirection.equals( Direction.W ))
				this.location = Collectioning.locations.get( 2 );
			break;
		case 5:
			if(inputedDirection.equals( Direction.N ))
				this.location = Collectioning.locations.get( 0 );

			if(inputedDirection.equals( Direction.S ))
				this.location = Collectioning.locations.get( 1 );

			if(inputedDirection.equals( Direction.E ))
				this.location = Collectioning.locations.get( 2 );

			if(inputedDirection.equals( Direction.W ))
				this.location = Collectioning.locations.get( 3 );
			break;

		}

	}
}
