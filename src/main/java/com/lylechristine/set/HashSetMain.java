package com.lylechristine.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

    public static void main(String[] args) {

        HashSet<String> countries = new HashSet<String>();

        // Add elements to set using add()
        countries.add("Germany");
        countries.add("France");
        countries.add("Belgium");
        countries.add("PookaDookaLand");

        // Print out set
        System.out.println(countries);

        // Size of set
        System.out.println(countries.size());

        // Confirm existence of element
        System.out.println("This set of countries contains Germany: " + countries.contains("Germany"));
        System.out.println("This set of countries contains DoopyLoopyLand: " + countries.contains("DoopyLoopyLand"));

        // Evaluate and decide
        if(countries.isEmpty()) {
            System.out.println("Set is empty - now adding new country India");
            countries.add("India");
            System.out.println(countries);
        } else {
            System.out.println("Countries set is not empty. Size = " + countries.size());
        }

        // Implement iterator
        Iterator<String> iterator = countries.iterator();

        while(iterator.hasNext()) {
            System.out.println("Country: " + iterator.next() + " | " + "HashCode: " + iterator.hashCode());
        }
    }
}

