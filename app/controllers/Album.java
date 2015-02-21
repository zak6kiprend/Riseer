package models;

import java.util.List;

public class Album {
	
	private String title;
	private String artist;
	private List<Music> track;
	
	public Album(String title, String artist, List<Music> track) {
		this.title = title;
		this.artist = artist;
		this.track = track;
	}

}
