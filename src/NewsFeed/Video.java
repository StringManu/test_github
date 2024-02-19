package NewsFeed;

import java.util.ArrayList;

public class Video extends PictureMessage{

	public Video(String nameOfAuthor, long time, int likes, ArrayList<String> comments, String headline,
			String dataName,int likesOfComments, ArrayList<String> hashtag) {
		super(nameOfAuthor, time, likes, comments, headline, dataName,likesOfComments,hashtag);
	}
	
	
	
}
