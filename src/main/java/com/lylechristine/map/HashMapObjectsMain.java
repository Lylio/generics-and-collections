package com.lylechristine.map;

import java.util.HashMap;

public class HashMapObjectsMain {

    public static void main(String[] args) {

        String name = null;

        // Create empty HashMap with Person data type
        HashMap<String, Person> teamA = new HashMap<>();

        // Add entries
        teamA.put("JS56-GLA11", new Person("Jane Smith", "JS56", "Sales", "GLA11"));
        teamA.put("MS23-GLA11", new Person("Mike Swim", "MS23", "Sales", "GLA11"));
        teamA.put("SB19-GLA17", new Person("Sarah Bean","SB19", "Marketing", "GLA17"));
        teamA.put("MW10-GLA19", new Person("Mary Weather", "MW10", "HR", "GLA19"));

        // Print
        System.out.println(teamA);

        String department = teamA.get("SB19-GLA17").getDepartment();
        System.out.println("Staff member with ID 'SB19-GLA17' works in department: " + department);
    }

}

