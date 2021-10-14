package com.training.sepprogram;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[]args){
        Stack<String> st = new Stack<String>();
        st.push("ant");
        st.push("tiger");
        st.push("cat");
        st.push("rat");
        System.out.println(st);
        st.pop();
        System.out.println(st);
        Iterator<String> I = st.iterator();
        while(I.hasNext()){
            System.out.println(I.next());
        }









       /* Stack s =new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));*/

    }
}
