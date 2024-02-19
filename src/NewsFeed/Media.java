package NewsFeed;

import java.util.ArrayList;

public abstract class Media {

	private String nameOfAuthor;
	private long time;
	private int likes;
	private ArrayList<String> comments;
	
	public Media(String nameOfAuthor, long time, int likes, ArrayList<String> comments) {
		this.nameOfAuthor = nameOfAuthor;
		this.time = time;
		this.likes = likes = 0;
		this.comments = comments;
	}
	
	public String getNameOfAuthor() {
		return nameOfAuthor;
	}
	public long getTime() {
		return time;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int l) {
		this.likes = l;
	}
	public ArrayList<String> getComments() {
		return comments;
	}

	
	public String toString() {
		return "Author name:    " + this.nameOfAuthor + "\n\t likes:    " + this.likes + 
				"\n\t time it was posted:    " + this.time;
	}
	
	
	
}
