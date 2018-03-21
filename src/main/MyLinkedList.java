package main;

public class MyLinkedList {

	private ListItem current;
	private ListItem first;

	public MyLinkedList( ) {
		this.first = null;
		this.current = first;
	}

	public boolean addNode(ListItem item){

		//add to empty list
		if(this.first == null){
			this.first = item;
			this.current = this.first;
			return true;
		}
		else {
			this.current = this.first;
			//special case: put at head (before first)
			if ( item.compareTo( this.current ) < 0 ) {
				this.first = item;
				this.first.setNext( this.current );
				this.first.setPrevious( null );
				this.current.setPrevious( item );
				System.out.println( "item put at first position" );
				return true;
			}
			//other cases
			while ( item.compareTo( this.current ) > 0 ) {

				//special case: put at last position
				if ( this.current.next == null ) {
					this.current.setNext( item );
					this.current.next.setPrevious( this.current );
					this.current.next.setNext( null );
					System.out.println( "item put at last position" );
					return true;
				}
				//normal case
				this.current = this.current.next();
			}
			if ( item.compareTo( this.current ) == 0 ) {
				System.out.println( "That item already exists in the list." );
				return true;
			}
			if ( item.compareTo( this.current ) < 0 ) {
				ListItem oldPrevious = this.current.previous;
				this.current.setPrevious( item );
				this.current.previous.setNext( this.current );
				this.current.previous.setPrevious( oldPrevious );
				this.current.previous.previous.setNext( item );

				System.out.println( "item put at normal correct position" );
				return true;
			}
		}
		return false;
	}


	public void print(){
		System.out.println("");
		this.current = this.first;
		while(this.current != null){
			System.out.print( this.current.value + ", " );
			this.current = this.current.next;
		}
	}
}
