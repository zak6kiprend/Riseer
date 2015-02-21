package Rizeer;

import java.util.ArrayList;
import java.util.List;

public class Artist extends Profil{

    private List<Album> mediatheque;
    private List<Profil> followers;
    private List<String> annonce;
    private String biographie;
    
    public Artist(String photo, String nom, String prenom, String email, String login, String password, String biographie) {
        super(photo, nom, prenom, email, login, password);
        mediatheque = new ArrayList<Album>();
        followers = new ArrayList<Profil>();
        annonce = new ArrayList<String>();
        this.biographie = biographie;
    }

    public List<Album> getMediatheque() {
        return mediatheque;
    }

    public void setMediatheque(List<Album> mediatheque) {
        this.mediatheque = mediatheque;
    }

    public List<Profil> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Profil> followers) {
        this.followers = followers;
    }

    public List<String> getAnnonce() {
        return annonce;
    }

    public void setAnnonce(List<String> annonce) {
        this.annonce = annonce;
    }

    public String getBiographie() {
        return biographie;
    }

    public void setBiographie(String biographie) {
        this.biographie = biographie;
    }

}
