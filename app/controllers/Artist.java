package models;

import java.util.List;

public class Artist extends Profile{

	private List<Album> library;
	
	public Artist(String login, String password, String email) {
		super(login, password, email);
	}
	
	public Artist(User user){
		super(user.getLogin(),user.getPassword(),user.getEmail());
	}
	
	public void addAlbum(Album album){
		library.add(album);
	}
	
	public void addMusic(Album album, Music music){
	}
	
}