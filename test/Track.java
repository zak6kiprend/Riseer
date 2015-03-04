package Services;

import java.util.*;

public class Track {
	//Variable
	private String name;
	private String file;
	private List<String> like;
	private List<String> comment;
	private List<Integer> note;
	private List<Genre> genres;
	
	//Constructeur
	
	public Track()
	{
		name = "";
		file = "";
		like = new ArrayList<String>();
		comment = new ArrayList<String>();
		note = new ArrayList<Integer>();
		genres = new ArrayList<Genre>();
	}
	
	public Track(String name,String file)
	{
		this.name = name;
		this.file = file;
		like = new ArrayList<String>();
		comment = new ArrayList<String>();
		note = new ArrayList<Integer>();
		genres = new ArrayList<Genre>();
		genres.add(new Genre());
	}
	//get and set
	
	public List<Genre> getGenres() {
		return genres;
	}

	public void addGenres(Genre genres) {
		this.genres.add(genres);
	}
	public void removeGenres(Genre genres) {
		if(this.genres.contains(genres))
			this.genres.remove(genres);
	}
	public void switchGenres(Genre gcont,Genre gswtch)
	{
		if(genres.contains(gcont))
			genres.set(genres.indexOf(gcont), gswtch);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public List<String> getLike() {
		return like;
	}

	public List<String> getComment() {
		return comment;
	}

	public List<Integer> getNote() {
		return note;
	}

	//Méthode
	
	public void liker(String personne) 
	{
		like.add(personne);
	}
	
	public void commenter(String commentaire)
	{
		comment.add(commentaire);
	}
	
	public void noter(int i)
	{
		if (i<5) 
		{
			note.add(i);
		}
	}
	
	public int moyenne() 
	{
		int somme = 0;
		for (int i = 0; i < note.size() ; i++)
		{
			somme = somme + note.get(i);
		}
		return somme/note.size();
	}

}
