package com.lylechristine.map;

import java.util.LinkedHashMap;

public class LinkedHashMapMain {

    public static void main(String[] args) {

        // Create empty LinkedHashMap
        LinkedHashMap<String, Integer> snooker = new LinkedHashMap<String, Integer>();
        // Add entries to LinkedHashMap
        snooker.put("red", 1);
        snooker.put("yellow", 2);
        snooker.put("green", 3);
        snooker.put("brown", 4);
        snooker.put("blue", 5);
        snooker.put("pink", 6);
        snooker.put("black", 7);

        // Print out entries in LinkedHashMap
        System.out.println(snooker);

        // Print object value of key lookup
        int pinkPoints = snooker.get("pink");
        System.out.println("Pink is worth: " + pinkPoints);

        // Return LinkedHashMap size
        int snookerLHMSize = snooker.size();
        System.out.println("Snooker LHM size: " + snookerLHMSize);

        // Check if LinkedHashMap is empty or not
        System.out.println("Snooker LHM is empty: " + snooker.isEmpty());

        // Check for existence of key
        System.out.println("Snooker LHM contains key 'blue': " + snooker.containsKey("blue"));

        // Check for existence of value
        System.out.println("Snooker LHM contains value 15: " + snooker.containsValue(15));

    }
}

