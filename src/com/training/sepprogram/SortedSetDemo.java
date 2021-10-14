package com.training.sepprogram;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<String>();
        // Add the elements in the given set.
        set.add("Audi");
        set.add("BMW");
        set.add("Mercedes");
        set.add("Baleno");
        System.out.println("The list of elements is given as:");
        for (Object object : set) {
            System.out.println(object);
        }
        //Returns the first element
        System.out.println("The first element is given as: " + set.first());
        //Returns the last element
        System.out.println("The last element is given as: " + set.last());
        //Returns a view of the portion of the given set whose elements are strictly less than the toElement.
        System.out.println("The respective element is given as: " + set.headSet("Baleno"));
        //Returns a view of the map whose keys are strictly less than the toKey.
        System.out.println("The respective element is given as: " + set.tailSet("Audi"));
    }
}

