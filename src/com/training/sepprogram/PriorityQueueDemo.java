package com.training.sepprogram;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[]args){
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("ball");
        pq.add("beach");
        pq.add("sun");
        pq.add("waves");
        System.out.println(pq.element());
        System.out.println(pq.peek());
        Iterator<String> I = pq.iterator();
        while(I.hasNext())
        {
            I.next();
        }
        pq.remove();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }
}
