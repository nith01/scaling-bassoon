package com.training.sepprogram;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[]args){
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("Apple");
        dq.add("mangos");
        dq.add("banana");
        for (String s:dq) {
            System.out.println(s);

        }
    }
}
