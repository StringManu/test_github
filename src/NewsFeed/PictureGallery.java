package NewsFeed;

import java.util.ArrayList;

public class PictureGallery extends Media{

	private ArrayList<String> pictureNames;
	private String galleryHeadline;
	
	public PictureGallery(String nameOfAuthor, long time, int likes, ArrayList<String> comments,
			ArrayList<String> pictureNames, String galleryHeadline,int likesOfComments, ArrayList<String> hashtag) {
		super(nameOfAuthor, time, likes, comments,likesOfComments,hashtag);
		this.pictureNames = pictureNames;
		this.galleryHeadline = galleryHeadline;
	}
	
	public ArrayList<String> getPictureNames() {
		return pictureNames;
	}
	public void setPictureNames(ArrayList<String> pictureNames) {
		this.pictureNames = pictureNames;
	}
	public String getGalleryHeadline() {
		return galleryHeadline;
	}
	public void setGalleryHeadline(String galleryHeadline) {
		this.galleryHeadline = galleryHeadline;
	}
	
	public String toString() {
		return super.toString() + "\n\t Headline of Gallery: " + this.galleryHeadline + 
				"\n\t Headlines of pictures: " + this.pictureNames;
	}
	
}
