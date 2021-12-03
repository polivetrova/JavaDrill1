package L110;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    private HashMap<String, ArrayList<String>> phones;

    public Phonebook(){
        this.phones = new HashMap<>();
        phones.put("Smith", new ArrayList<>(List.of("9283048")));
        phones.put("Adams", new ArrayList<>(List.of("238728401")));
        phones.put("Kim", new ArrayList<>(List.of("230947011")));
        phones.put("Um", new ArrayList<>(List.of("12560002")));
    }

    public void add(String surname, String phoneNumber){
        if(phones.containsKey(surname)){
            phones.get(surname).add(phoneNumber);
        } else {
            phones.put(surname, new ArrayList<>());
            phones.get(surname).add(phoneNumber);
        }
    }

    public ArrayList<String> get(String surname){

        if(phones.containsKey(surname)){
            return phones.get(surname);
        } else {
            System.out.printf("No such surname (%s) in the database", surname);
            return null;
        }
    }
}
