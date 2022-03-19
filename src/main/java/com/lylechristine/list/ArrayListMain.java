package com.lylechristine.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {

    public static void main(String[] args) {

        // create
        ArrayList<String> colours = new ArrayList<String>();

        // add
        colours.add("blue");
        colours.add("purple");
        colours.add("violet");
        colours.add("red");
        colours.add("orange");

        // access
        String accessExample = colours.get(2);
        System.out.println(accessExample); //violet

        // change
        String newColour = "green";
        colours.set(4, newColour);
        System.out.println(colours); // [blue, purple, violet, red, green]

        // remove
        colours.remove("blue");
        colours.remove(colours.size() - 1);
        System.out.println(colours); // [purple, violet, red]

        // size
        System.out.println("The size of the colours ArrayList is: " + colours.size());

        // sort
        Collections.sort(colours);
        System.out.println(colours);

    }
}

