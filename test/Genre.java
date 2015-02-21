package Services;

public class Genre {
	
	//Variable
	private String genre;
	private final String tag = "other";
	private final String tag1 = "rock";
	private final String tag2 = "rap";
	private final String tag3 = "jazz";
	private final String tag4 = "funk";
	
	//Constructeur
	public Genre() 
	{
		genre = tag;
	}
	
	public Genre (String genre)
	{
		switch(genre)
		{
		case tag1 : genre = tag1;
					break;
		case tag2 : genre = tag2;
					break;
		case tag3 : genre = tag3;
					break;
		case tag4 : genre = tag4;
					break;
		default : genre = tag;
		break;
		}
	}
}
