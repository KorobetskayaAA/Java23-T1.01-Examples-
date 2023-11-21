package messages;

public class TextMessage extends Message {
  public String text;
  
  public String toString() {
    return super.toString() + "\n" + text;
  }
  
  public TextMessage(String title, String author, String text) {
	super(title, author);
	this.text = text;
  }
}
