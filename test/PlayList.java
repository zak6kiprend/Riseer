package Services;

import java.util.ArrayList;
import java.util.List;


public class PlayList {
	
	private int id;	//récupérer l'id de la base
	private String name;
	private List<Track> listeLecture;
	
	//Constructeur
	
	public PlayList() 
	{
		id = 0;
		name ="";
		listeLecture = new ArrayList<Track>();
	}
	
	public PlayList(int id,String name)
	{
		this.id = id;
		this.name = name;
		listeLecture = new ArrayList<Track>();
	}
	
	public PlayList(int id)
	{
		this.id = id;
		this.name = ""+id;
		listeLecture = new ArrayList<Track>();
	}
	
	//Get & set
	
	//Methode
	public void add(Track piste)
	{
		listeLecture.add(piste);
	}
	
	public void remove(Track piste)
	{
		if(listeLecture.contains(piste))
			listeLecture.remove(piste);
	}
	
}
