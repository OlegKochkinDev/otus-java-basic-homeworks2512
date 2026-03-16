package ru.otus.java.basic.homeworks.hw17;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private static Map<String,String> map = new HashMap<>();


    public void add(String phoneNumber, String name) {
        map.put(phoneNumber, name);
    }

    public void printAll(){
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, String> findByName(String name) {
       Map<String,String> result = new HashMap<>();

       for (Map.Entry<String,String> entry : map.entrySet()) {
           if (entry.getValue().toUpperCase().contains(name.toUpperCase())){
               result.put(entry.getKey(), entry.getValue());
           }
       }
       return result;
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        return map.containsKey(phoneNumber);
    }


}
