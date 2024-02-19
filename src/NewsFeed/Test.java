package NewsFeed;

public class Test {

	public static void main(String[] args) {
		
		PictureMessage p1 = new PictureMessage("Hans",3000,0,null,"Cool Picture","cool_picture.png");
		Message m1 = new Message("Frederik",5000,0,null,"Everybody, can you feel the groove");
		NewsFeed n = new NewsFeed();
		
		p1.setLikes(312);
		m1.setLikes(13450);
		
		n.addMediaToNewsFeed(m1);
		n.printAllPostsOut();
		n.addMediaToNewsFeed(p1);
		n.printOutPostFromUser("Frederik");
		n.deleteMediaFromNewsFeed(m1);
		n.printAllPostsOut();
	}

}
