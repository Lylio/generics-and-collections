package com.lylechristine.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {

    public static void main(String[] args) {

        Queue<String> pq = new PriorityQueue<>();

        // The insertion order is not retained in the PriorityQueue.
        // The elements are stored based on the priority order which is ascending by default.
        pq.add("One");
        pq.add("Two");
        pq.add("Three");
        pq.add("Four");

        System.out.println(pq);
    }
}

