package Rizeer;

import java.util.HashMap;
import java.util.List;

public class Son {
    
    private String name;
    private String file;
    private List<Profil> like;
    private HashMap<String,Profil> comment;
    private List<Tag> genres;
    private Album album;
    
    public Son(String name, String file, List<Profil> like, HashMap<String, Profil> comment, List<Tag> genres,
            Album album) {
        super();
        this.name = name;
        this.file = file;
        this.like = like;
        this.comment = comment;
        this.genres = genres;
        this.album = album;
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

    public List<Profil> getLike() {
        return like;
    }

    public void setLike(List<Profil> like) {
        this.like = like;
    }

    public HashMap<String, Profil> getComment() {
        return comment;
    }

    public void setComment(HashMap<String, Profil> comment) {
        this.comment = comment;
    }

    public List<Tag> getGenres() {
        return genres;
    }

    public void setGenres(List<Tag> genres) {
        this.genres = genres;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

}
