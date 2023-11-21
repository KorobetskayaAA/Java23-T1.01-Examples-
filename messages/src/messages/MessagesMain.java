package messages;

public class MessagesMain {
  public static void main(String[] args) {
    Message msg1 = new TextMessage("title", "author", "text");
    msg1.publish();
    //msg1.text = "Some text"; // Ошибка!
    if (msg1 instanceof TextMessage) {
      System.out.println(((TextMessage)msg1).text);
    }
    
    //DataMessage msg2 = (DataMessage)msg1; //Ошибка!
    
    System.out.println(msg1.toString());
  }
}
