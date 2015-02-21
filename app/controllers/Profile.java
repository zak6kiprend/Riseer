package models;

import java.util.List;


public abstract class Profile{
	
	private String login;
	private String password;
	private String email;
	private List<Artist> follow;
	private List<Comment> comment;
	private List<Like> like;
	private List<List<Music>> playList;
	
	public Profile(String login, String password, String email){
		this.login = login;
		this.password = password;
		this.email = email;
		follow=null;
		comment=null;
		like=null;
		playList=null;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Artist> getFollow() {
		return follow;
	}
	public void setFollow(List<Artist> follow) {
		this.follow = follow;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	public List<Like> getLike() {
		return like;
	}
	public void setLike(List<Like> like) {
		this.like = like;
	}
	public List<List<Music>> getPlayList() {
		return playList;
	}
	public void setPlayList(List<List<Music>> playList) {
		this.playList = playList;
	}
	
	
	
}