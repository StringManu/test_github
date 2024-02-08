package NewsFeed;

import java.util.ArrayList;

public class Message extends Media{

	private String text;

	public Message(String nameOfAuthor, long time, int likes, ArrayList<String> comments, String text) {
		super(nameOfAuthor, time, likes, comments);
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String toString() {
		return super.toString() + "\n\t text of the Message:    " + this.text;
	}
	
}
