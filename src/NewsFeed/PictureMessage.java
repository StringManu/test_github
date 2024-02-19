package NewsFeed;

import java.util.ArrayList;

public class PictureMessage extends Media{

	private String headline;
	private String dataName;
	
	public PictureMessage(String nameOfAuthor, long time, int likes, ArrayList<String> comments, String headline,
			String dataName,int likesOfComments, ArrayList<String> hashtag) {
		super(nameOfAuthor, time, likes, comments,likesOfComments,hashtag);
		this.headline = headline;
		this.dataName = dataName;
	}
	
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getDataName() {
		return dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public String toString() {
		return super.toString() + "\n\t headline:    " + this.headline + "\n\t dataname:    " + this.dataName;
	}
	
}
