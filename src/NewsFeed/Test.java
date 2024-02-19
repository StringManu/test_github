package NewsFeed;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> comments1 = new ArrayList<>();
		ArrayList<String> hashtags1 = new ArrayList<>();
		comments1.add("Cool");
		hashtags1.add("#unlustig");
		hashtags1.add("#didntLaugh");
		Video video1 = new Video("John Doe", 123, 160, comments1, "Funny Cat Compilation", "cat_compilation.mp4", 80, hashtags1);

		NewsFeed n = new NewsFeed();
		n.addMediaToNewsFeed(video1);
		n.postWithHashtag("#unlustig");
		System.out.println(video1.getLikesOfComments());
	}

}
