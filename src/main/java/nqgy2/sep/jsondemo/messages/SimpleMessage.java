package nqgy2.sep.jsondemo.messages;

public class SimpleMessage extends Message{
  public String from;
  public String message;
  public String simplestring;

  public SimpleMessage(String from, String message, String simplestring) {
    super("simple");
    this.from = from;
    this.message = message;
    this.simplestring = simplestring;
  }
}
