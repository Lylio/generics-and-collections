package com.lylechristine.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {

    public static void main(String[] args) {

        List<String> colours = new ArrayList<String>();
        colours.add("blue");
        colours.add("pink");
        colours.add("yellow");
        colours.add("green");

        Iterator<String> it = colours.iterator();

//        while (!it.hasNext() == false) {
//            System.out.println(colours.iterator().next());
//        }
        System.out.println(colours);

        System.out.println(it.next());
    }
}

