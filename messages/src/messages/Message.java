package messages;

import java.util.Date;

public class Message {
  String title;
  Date publishDate;
  String author;

  public Message(String title, String author) {
    this.title = title;
    this.author = author;
  }
  
  public String toString() {
    return author + ": " + title;
  }

  public void publish() {
    publishDate = new Date();
  }
}
