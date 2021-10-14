package com.training.augprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListinoneline {
    public static void main(String[] args) {
        //Array creation and initialization in one line
        String[] strArr = {"Java", "Array", "list"};
        System.out.println("Array:" + Arrays.toString(strArr));

        //ArrayList creation and initialization in one line
        List<String> strArrList = Arrays.asList("Java", "Array", "List");
        System.err.println("ArrayList:" + strArrList);

    }
}
