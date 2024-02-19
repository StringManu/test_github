package NewsFeed;

import java.util.ArrayList;

public abstract class Media {

	private String nameOfAuthor;
	private long time;
	private int likes;
	private ArrayList<String> comments;
	private int likesOfComments;
	private ArrayList<String> hashtag;
	
	public Media(String nameOfAuthor, long time, int likes, ArrayList<String> comments, int likesOfComments, ArrayList<String> hashtag) {
		this.nameOfAuthor = nameOfAuthor;
		this.time = time;
		this.likes = likes = 0;
		this.comments = comments;
		this.likesOfComments = likesOfComments;
		this.hashtag = hashtag;
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
	public int getLikesOfComments() {
		return likesOfComments;
	}
	public void setLikesOfComments(int likesOfComments) {
		this.likesOfComments = likesOfComments;
	}
	public ArrayList<String> getHashtag() {
		return hashtag;
	}
	public void setHashtag(ArrayList<String> hashtag) {
		this.hashtag = hashtag;
	}

	public String toString() {
		return "Author name:    " + this.nameOfAuthor + "\n\t likes:    " + this.likes + 
				"\n\t time it was posted:    " + this.time + "\n\t Hashtags of Post: " + this.hashtag;
	}
	
	
	
}
