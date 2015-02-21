package Rizeer;

import java.util.List;

public class Album {

    
    private String title;
    private List<Son> pistes;
    private Artist chanteur;
    
    public Album(String title, List<Son> pistes, Artist chanteur) {
        this.title = title;
        this.pistes = pistes;
        this.chanteur = chanteur;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Son> getPistes() {
        return pistes;
    }

    public void setPistes(List<Son> pistes) {
        this.pistes = pistes;
    }

    public Artist getChanteur() {
        return chanteur;
    }

    public void setChanteur(Artist chanteur) {
        this.chanteur = chanteur;
    }
    
}
