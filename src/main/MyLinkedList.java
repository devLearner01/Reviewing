package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyLinkedList{

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

	public boolean exists( String value ) {

		List<String> array = this.prepareForBinarySearch();
		int valueFound  =  Collections.binarySearch( array, value ) ;
		if(valueFound >= 0)
			return true;
		else
			return false;
	}


	private int size(){
		this.current = this.first;

		if(this.first == null)
			return 0;
		int count = 1;
		while(this.current.next != null){
			count++;
			this.current = this.current.next();
		}
		return count;
	}


	private List<String> prepareForBinarySearch(){

		String[] array = new String[this.size()];
		this.current = this.first;
		if(array.length == 0)
			return null;
		for(int i = 0; this.current.next != null; i++ ){
			array[i] = (String)this.current.getValue();
			this.current = this.current.next();
		}

		return Arrays.asList( array );
	}
}
