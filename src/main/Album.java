package main;

import java.util.LinkedList;
import java.util.List;

public class Album {

	private List<Song> songList;

	public Album() {
		songList = new LinkedList<>(  );
	}

	public List<Song> getSongList() {
		return songList;
	}

	public void addSong2Album( Song song){
		this.songList.add( song );
	}
}
