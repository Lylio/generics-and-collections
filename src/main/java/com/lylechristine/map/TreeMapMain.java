package com.lylechristine.map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain {

    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<String, String> placings = new TreeMap<String, String>();

        // Add items to TreeMap
        placings.put("first", "gold");
        placings.put("second", "silver");
        placings.put("third", "bronze");
        placings.put("fourth", "copper");
        placings.put("fifth", "tin");

        // Check ordering - by default, TreeMap is sorted
        System.out.println(placings);

        // Return size
        int placingsSize = placings.size();
        System.out.println(placingsSize);

        // Return the first (sorted) entry
        System.out.println(placings.firstEntry());

        // Return just the values (no keys)
        System.out.println(placings.values());

        // Return just the keys (no values)
        System.out.println(placings.keySet());

        // Collect all keys into a Set using keySet()
        Set<String> keys = placings.keySet();

        // Iterate using forEach()
        keys.forEach(key ->
                System.out.println(key));
    }
}

