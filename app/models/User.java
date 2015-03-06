package Rizeer;

public class User extends Profil{

    private boolean futureArtiste;
    
    public User(String photo, String nom, String prenom, String email, String login, String password) {
        super(photo, nom, prenom, email, login, password);
        futureArtiste=false;
    }

    public boolean isFutureArtiste() {
        return futureArtiste;
    }

    public void setFutureArtiste(boolean futureArtiste) {
        this.futureArtiste = futureArtiste;
    }

}
