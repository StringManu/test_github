package NewsFeed;

import java.util.ArrayList;

public class NewsFeed {

	private ArrayList<Media> newsFeed;

	public NewsFeed() {
		this.newsFeed = new ArrayList<Media>();
	}

	public ArrayList<Media> getNewsFeed() {
		return newsFeed;
	}

	public void setNewsFeed(ArrayList<Media> newsFeed) {
		this.newsFeed = newsFeed;
	}
	
	public void addMediaToNewsFeed(Media media) {
			newsFeed.add(media);
	}
	
	public void deleteMediaFromNewsFeed(Media m) {
		newsFeed.remove(m);
	}
	
	public ArrayList<Media> findPostFromUser(String authorName){
		ArrayList<Media> tmp = new ArrayList<Media>();
		for(Media m : newsFeed) {
			if(m.getNameOfAuthor().equalsIgnoreCase(authorName)) {
				tmp.add(m);
			}
		}
		return tmp;
	}
	
	public void printAllPostsOut() {
		for(Media m : newsFeed) {
			System.out.println(m);
		}
	}
	
	public void printOutPostFromUser(String authorName) {
		for(Media m : findPostFromUser(authorName)) {
			System.out.println(m);
		}
	}
	
	public ArrayList<Media> postWithHashtag(String hashtag) {
		ArrayList<Media> tmp = new ArrayList<Media>();
		for(Media m : newsFeed) {
			int i = 0;
			String tmp2 = m.getHashtag().get(i);
			if(tmp2.equalsIgnoreCase(hashtag)) {
				tmp.add(m);
				System.out.println(m);
			}
			i++;
			}
		return tmp;
	}
	
}
