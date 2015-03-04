import java.util.Scanner;

import radams.gracenote.webapi.GracenoteException;
import radams.gracenote.webapi.GracenoteWebAPI;
import Utils.Recherche;

public class MainRecherche
{
    private static String clientID  = "12383232-C16B17D826EA99FE7123A650AC420AAC"; // Put your clientID here.
    private static String clientTag = "C16B17D826EA99FE7123A650AC420AAC"; // Put your clientTag here.
    private static GracenoteWebAPI api;
    
    public static void main(String[] args)
    {
        realSearch();
    }
    
    private static void realSearch(){
    	try
        {
            api = new GracenoteWebAPI(clientID, clientTag); // If you have a userID, you can specify it as the third parameter to constructor.
            if(api!=null){
            	
            	Scanner scanner = new Scanner(System.in);
            	System.out.print("Veuillez écrire votre recherche : ");
            	String res = scanner.nextLine();
            	
            	// On n'accepte pas les recherches vides
            	while(res.trim().equals("")){
            		System.out.print("\nERREUR ! Veuillez écrire une recherche correcte s'il vous plait !\n"
            				+ "Votre recherche :");
                	res = scanner.nextLine();
            	}
            		
            	scanner.close();

            	long temps = System.currentTimeMillis();
            	System.out.println("Début de l'opération de recherche avec "+res+" ...\n");
            	new Recherche(api).displayResults(res);
            	System.out.println("Fin de l'opération. \n"
            			+ "Durée totale : "+(System.currentTimeMillis()-temps)/1000.0+" secondes !\n");
            	
            } else {
            	System.out.println("Problème d'API");
            }
        }
        catch (GracenoteException e) {
            e.printStackTrace();
        }
    }
    
}
