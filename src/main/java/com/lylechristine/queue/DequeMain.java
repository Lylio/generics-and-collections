package com.lylechristine.queue;


/* Deque interface. It’s an array-based implementation of a double-ended queue.
As the name suggests, a double-ended queue is a queue that allows us to add or remove
items from both front and rear ends.
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(1);
        dq.addLast(2);
        dq.offerFirst(3);
        dq.offerLast(4);

        System.out.println(dq); //[3, 1, 2, 4]

        System.out.println(dq.getFirst() + ":" + dq.peekFirst());
        System.out.println(dq.getLast() + ":" + dq.peekLast());

        System.out.println("- - - - - Deque Deletion - - - - -");

        Deque<Integer> dq2 = new ArrayDeque<>();

        dq2.addLast(1);
        dq2.addLast(2);

        Integer val1 = dq2.removeFirst(); //1
        System.out.println(dq2); //[2]

        Integer val2 = dq2.pollFirst(); //2
        System.out.println(dq2); //[]

        val1 = dq2.removeFirst(); // will throw a NoSuchElementException
        val2 = dq2.pollFirst(); // null

    }
}

