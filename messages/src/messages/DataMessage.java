package messages;

import java.util.LinkedList;
import java.util.List;

public class DataMessage extends Message {
  List<Object> data = new LinkedList<Object>();

  public void addData(Object item) {
    data.add(item);
  }

  public DataMessage(String title, String author) {
    super(title, author);
  }
}
