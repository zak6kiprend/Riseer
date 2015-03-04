package Services;

import java.util.ArrayList;
import java.util.List;

public class Album {
	//Variable
	private String title;
	public List<Track> tracks;
	
	//Constructeur
	public Album()
	{
		title = "";
		tracks = new ArrayList<Track>();
	}
	
	public Album(List<Track> tracks)
	{
		title = "unknow";
		this.tracks = tracks;
	}
	
	public Album(String title,List<Track> tracks)
	{
		this.title = title;
		this.tracks = new ArrayList<Track>();
		this.tracks = tracks;
	}
	//get &set

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	//Methode
	public void add(Track e)
	{
		tracks.add(e);
	}
	
	public void remove(Track e) 
	{
		if(tracks.contains(e))
			tracks.remove(e);
	}
}
