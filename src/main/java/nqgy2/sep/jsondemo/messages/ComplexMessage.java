package nqgy2.sep.jsondemo.messages;

public class ComplexMessage {
  public String from;
  public String message;
  public String complexString;
  public boolean someBoolValue;
  public int[] arrayOfRandomIntValues;

  public ComplexMessage(
      String from, String message, String complexString, boolean someBoolValue, int[] intArray) {
    this.from = from;
    this.message = message;
    this.complexString = complexString;
    this.someBoolValue = someBoolValue;
    this.arrayOfRandomIntValues = intArray;
  }
}
