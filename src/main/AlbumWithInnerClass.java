package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AlbumWithInnerClass {

	SongList songs;

	public AlbumWithInnerClass() {
		songs = new SongList();
	}


	public void addSong2Album(Song song){
		this.songs.addSong2SongList( song );
		System.out.println("song " + song + "added!");
	}


	public Song getSongbyIndex(int index){
		return this.songs.findSong( index );
	}

	class SongList{

		private List<Song> songList;

		public SongList() {
			songList = new ArrayList<Song>(  );
		}

		private void addSong2SongList( Song song){
			this.songList.add( song );
		}

		private Song findSong(int index){

			if(index >= 0 && index < songList.size()){
				System.out.println("song" + songList.get( index )+ "found");
				return this.songList.get( index );
			}
			else {
				System.out.println( "song not found" );
				return null;
			}
		}

	}
}
