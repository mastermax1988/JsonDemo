package nqgy2.sep.jsondemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import nqgy2.sep.jsondemo.messages.ComplexMessage;
import nqgy2.sep.jsondemo.messages.SimpleMessage;

public class Demo2JsonAusObjekt {

  public void demo(){
    Gson gson = new Gson();
    //Gson gson = new GsonBuilder().setPrettyPrinting().create();
    SimpleMessage simpleMessage = new SimpleMessage("Max", "HelloWorld", "");
    String jsonString = gson.toJson(simpleMessage);
    System.out.println(jsonString);

    SimpleMessage parsedMessage = gson.fromJson(jsonString,SimpleMessage.class);
    System.out.println(parsedMessage.from);
    System.out.println(parsedMessage.message);

    //wird die falsche Klasse angegeben, so werden nur die passenden Variablen belegt.
    ComplexMessage complexMessage = gson.fromJson(jsonString, ComplexMessage.class);
    System.out.println(complexMessage.message);
  }
}
