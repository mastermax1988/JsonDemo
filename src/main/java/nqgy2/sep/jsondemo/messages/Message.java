package nqgy2.sep.jsondemo.messages;

abstract public class Message {

  public String messageType;

  public Message(String messageType) {
    this.messageType = messageType;
  }
}
