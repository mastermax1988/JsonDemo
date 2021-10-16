package nqgy2.sep.jsondemo.messages;

public class ComplexMessage {
  private String from;
  private String message;
  private boolean someBoolValue;
  private int[] intArray;

  public ComplexMessage(String from, String message, boolean someBoolValue, int[] intArray) {
    this.from = from;
    this.message = message;
    this.someBoolValue = someBoolValue;
    this.intArray = intArray;
  }

  public String getMessage() {
    return message;
  }

  public String getFrom() {
    return from;
  }

  public boolean isSomeBoolValue() {
    return someBoolValue;
  }

  public int[] getIntArray() {
    return intArray;
  }
}
