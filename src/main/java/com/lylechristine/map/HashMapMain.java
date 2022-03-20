package com.lylechristine.map;

import java.util.HashMap;

public class HashMapMain {

    public static void main(String[] args) {

        // Create empty hashmap
        HashMap<String, Integer> sales = new HashMap<String, Integer>();

        // Add elements using standard put() method
        sales.put("The Beatles", 600);
        sales.put("Elvis Presley", 500);
        sales.put("Michael Jackson", 400);
        sales.put("Elton John", 300);
        sales.put("Madonna", 275);

        // Return hashmap size
        int hashMapSize = sales.size();
        System.out.println("Sales HashMap size is: " + hashMapSize);

        // Perform key/value lookup
        System.out.println("Elvis presley has sold " + sales.get("Elvis Presley") + " million records.");
        System.out.println("Madonna has sold " + sales.get("Madonna") + " million records.");

        // Check for existence of key objects
        if(sales.containsKey("The Beatles")) {
            System.out.println("Found The Beatles.");
        } else {
            System.out.println("The Beatles NOT found.");
        }

        // Check for existence of value objects
        if(sales.containsValue(800)) {
            System.out.println("Found 800");
        } else {
            System.out.println("800 NOT found");
        }
    }
}

