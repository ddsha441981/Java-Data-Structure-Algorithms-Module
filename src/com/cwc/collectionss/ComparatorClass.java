package com.cwc.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorClass {
    public static void main(String[] args) {
        List<Integer> s1 = new ArrayList<>();
        s1.add(9);
        s1.add(20);
        s1.add(1);
        s1.add(5);
        s1.add(4);
        s1.add(3);
//        System.out.println(s1);
        Collections.sort(s1);
//        System.out.println(s1);

        Collections.sort(s1,(a, b) -> b-a);
        System.out.println(s1);




    }
}
