package nqgy2.sep.jsondemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import nqgy2.sep.jsondemo.messages.ComplexMessage;
import nqgy2.sep.jsondemo.messages.SimpleMessage;

public class Demo3Complex {
  public void demo() {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    ComplexMessage complexMessage =
        new ComplexMessage("Max", "Hello world", "complex", true, new int[] {3, 4, 5});
    String jsonString = gson.toJson(complexMessage);
    System.out.println(jsonString);

    ComplexMessage parsedMessage = gson.fromJson(jsonString, ComplexMessage.class);
    System.out.println(parsedMessage.from);

    //hier werden ebenfalls nur from und message mit daten gefüllt
    SimpleMessage wrongType = gson.fromJson(jsonString, SimpleMessage.class);
    System.out.println(wrongType.from);
  }
}
