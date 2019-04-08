package com.example.localdatatimedemo.support;

import com.example.localdatatimedemo.converter.LocalDateTimeJsonConverter;
import com.example.localdatatimedemo.model.Child;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDateTime;

class LocalDateTimeJsonConverterTest {

    private static Gson gson;

    static {
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeJsonConverter())
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
    }

    public static String convertObjectToJson(Child child) {
        return gson.toJson(child);
    }

    public static Child convertJsonToObject(String json, Class<Child> type) {
        return gson.fromJson(json, type);

    }

    public static void main(String[] args) {

        Child child = new Child();
        child.setFirstName("Joe");
        child.setLastName("Smith");
        child.setDateTimeofBirth(LocalDateTime.now());

        String childjsonString = convertObjectToJson(child);
        System.out.println("Child object to JsonString::" + childjsonString);

        Child child1 = convertJsonToObject(childjsonString, Child.class);
        System.out.println("Json String to Child Object::" + child1.toString());
    }

}