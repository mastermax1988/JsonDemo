package nqgy2.sep.jsondemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import java.util.Random;
import nqgy2.sep.jsondemo.messages.ComplexMessage;
import nqgy2.sep.jsondemo.messages.Message;
import nqgy2.sep.jsondemo.messages.SimpleMessage;

public class Demo4MessageType {
  public void demo() {
    Random random = new Random();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    SimpleMessage simpleMessage = new SimpleMessage("Max", "Hi", "");
    ComplexMessage complexMessage =
        new ComplexMessage("Max", "Hello World", "", true, new int[] {1, 2, 3, 4, 5, 6});

    String mysteryJson =
        random.nextBoolean() ? gson.toJson(simpleMessage) : gson.toJson(complexMessage);

    String parsedMessageType =
        JsonParser.parseString(mysteryJson).getAsJsonObject().get("messageType").getAsString();
    System.out.println("MessageType: " + parsedMessageType);
    
    switch (parsedMessageType){
      case "simple":
        SimpleMessage sMessage = gson.fromJson(mysteryJson,SimpleMessage.class);
        System.out.println(sMessage.from);
        break;
      case "complex":
        ComplexMessage cMessage = gson.fromJson(mysteryJson, ComplexMessage.class);
        System.out.println(cMessage.from);
        System.out.println(cMessage.someBoolValue);
        break;
      default:
        System.out.println("Unknown message type");
    }
  }
}
