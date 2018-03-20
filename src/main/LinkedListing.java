package main;

import java.util.*;

public class LinkedListing {

	private static List<Album> albumList = new ArrayList<Album>();
	private static List<Song> playList = new LinkedList<Song>();

	public static void songManager() {

		createAlbums();
		addSongs2PlayList();
		ListIterator<Song> playListIterator = playList.listIterator();
		Song currentSong = playListIterator.next();

		System.out.println("Menu: ");
		System.out.println("1- Quit ");
		System.out.println("2- Skip fw to the next song ");
		System.out.println("3- Skip bw to the previous song ");
		System.out.println("4- Replay current song ");
		System.out.println("5- List the songs in the playlist ");
		System.out.println("6- Remove current song from the playlist \n");

		Scanner scan = new Scanner( System.in );
		int option;

		while((option = scan.nextInt()) <= 6) {
			switch ( option ) {
			case 1:
				System.exit( 0 );
				break;
			case 2:
				if ( playListIterator.hasNext() ) {
					currentSong = playListIterator.next();
					System.out.println( "fw to the next song" );
				} else
					System.out.println( "that was the last song of the playlist" );
				break;
			case 3:
				if ( playListIterator.hasPrevious() ) {
					currentSong = playListIterator.previous();
					System.out.println( "bw to the previous song" );
				} else
					System.out.println( "that was the first song of the playlist" );
				break;
			case 4:
				playListIterator.set( currentSong );
				System.out.println( "current song is replayed." );
				break;
			case 5:
				while ( playListIterator.hasPrevious() ) {
					playListIterator.previous();
				}
				while(playListIterator.hasNext())
					System.out.println( playListIterator.next().toString() );
				break;
			case 6:
				playListIterator.remove();
				System.out.println( "Song removed." );
				break;
			default:
				System.out.println( "Please choose a valid option from the menu." );

			}
		}
	}

	private static void addSongs2PlayList() {

		playList.add( albumList.get( 0 ).getSongList().get( 0 ) );
		playList.add( albumList.get( 0 ).getSongList().get( 1 ) );
		playList.add( albumList.get( 2 ).getSongList().get( 0 ) );
		playList.add( albumList.get( 1 ).getSongList().get( 2 ) );
		playList.add( albumList.get( 2 ).getSongList().get( 3 ) );

	}

	private static void createAlbums(){
		Album album1 = new Album();
		album1.addSong2Album( new Song("bla", 3) );
		album1.addSong2Album( new Song("ble", 2) );
		album1.addSong2Album( new Song("bli", 4) );
		album1.addSong2Album( new Song("blo", 3) );
		album1.addSong2Album( new Song("blu", 2) );


		Album album2 = new Album();
		album2.addSong2Album( new Song("ta", 3) );
		album2.addSong2Album( new Song("te", 2) );
		album2.addSong2Album( new Song("ti", 4) );
		album2.addSong2Album( new Song("to", 3) );
		album2.addSong2Album( new Song("tu", 2) );

		Album album3 = new Album();
		album3.addSong2Album( new Song("lala", 3) );
		album3.addSong2Album( new Song("lele", 2) );
		album3.addSong2Album( new Song("lili", 4) );
		album3.addSong2Album( new Song("lolo", 3) );
		album3.addSong2Album( new Song("lulu", 2) );

		albumList.add( album1 );
		albumList.add( album2 );
		albumList.add( album3 );

	}

}
