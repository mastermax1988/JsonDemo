package nqgy2.sep.jsondemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import java.io.Reader;

public class Demo1JsonVonHand {

  public void demo(){
    JsonObject jsonObject = new JsonObject();
    jsonObject.add("from", new JsonPrimitive("Max"));
    jsonObject.add("message", new JsonPrimitive("Hello World!"));
    String jsonString = jsonObject.toString();
    System.out.println("Das jsonObjekt als String:");
    System.out.println(jsonString);

    JsonObject parsedObject = (JsonObject) JsonParser.parseString(jsonString);
    System.out.println("Parsed Data:");
    System.out.println(parsedObject.get("from"));
    System.out.println(parsedObject.get("from").getAsString());

    //Folgende Zeile löst eine Exception aus, da der Inhalt kein int ist
    //System.out.println(parsedObject.get("from").getAsInt());

    //hier wird null zurückgegeben, da der json-String die Variable to nicht enthält
    System.out.println(parsedObject.get("to"));
  }
}
