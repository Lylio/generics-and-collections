package com.lylechristine.list;

import java.util.LinkedList;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<String> linkedWeekdays = new LinkedList<String>();
        linkedWeekdays.add("Monday"); linkedWeekdays.add("Tuesday"); linkedWeekdays.add("Wednesday");
        linkedWeekdays.add("Thursday"); linkedWeekdays.add("Friday");

        System.out.println(linkedWeekdays);

        // addFirst()
        linkedWeekdays.addFirst("Sunday");
        System.out.println(linkedWeekdays);

        // addLast()
        linkedWeekdays.addLast("Saturday");
        System.out.println(linkedWeekdays);

        // removeFirst()
        linkedWeekdays.removeFirst();
        System.out.println(linkedWeekdays);

        // removeLast()
        linkedWeekdays.removeLast();
        System.out.println(linkedWeekdays);

        // getFirst()
        String first = linkedWeekdays.getFirst();
        System.out.println(first);

        // getLast()
        String last = linkedWeekdays.getLast();
        System.out.println(last);

    }

}

