package com.lylechristine.generics;

public class GenericClasses {

    public static void main(String[] args) {

        // Instance of Integer type
        SingleType<Integer> intObj = new SingleType<Integer>(23);
        System.out.println(intObj.getObject());

        // Instance of String type
        SingleType<String> strObj = new SingleType<String>("I can be a String type!");
        System.out.println(strObj.getObject());

        // Instance of Double type
        SingleType<Double> doubObj = new SingleType<Double>(34.67);
        System.out.println(doubObj.getObject());

        MultipleTypes<String, Integer> multiObj = new MultipleTypes<String, Integer>("Wow!", 5);
        multiObj.print();

        System.out.println("- - - - -  Generic Method Example - - - - -");

        genericDisplay(15);
        genericDisplay("Aubergine");
        genericDisplay(56.785435);
        genericDisplay(true);

    }

    // A Generic method example
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }
}

