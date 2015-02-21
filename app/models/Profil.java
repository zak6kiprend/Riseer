package Rizeer;

import java.util.ArrayList;
import java.util.List;

public class Profil {

    private String photo;
    private String nom;
    private String prenom;
    private String email;
    private String login;
    private String password;
    private List<Son> playlists;
    private List<User> rises;
    private List<Artist> follow;
    
    public Profil(String photo, String nom, String prenom, String email, String login, String password) {
        super();
        this.photo = photo;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.login = login;
        this.password = password;
        playlists = new ArrayList<Son>();
        rises = new ArrayList<User>();
        follow = new ArrayList<Artist>();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Son> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Son> playlists) {
        this.playlists = playlists;
    }

    public List<User> getRises() {
        return rises;
    }

    public void setRises(List<User> rises) {
        this.rises = rises;
    }

    public List<Artist> getFollow() {
        return follow;
    }

    public void setFollow(List<Artist> follow) {
        this.follow = follow;
    }
    
}
