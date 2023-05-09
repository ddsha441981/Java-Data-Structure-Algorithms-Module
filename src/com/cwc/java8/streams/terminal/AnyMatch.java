package com.cwc.java8.streams.terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AnyMatch {

    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("Java");
        a1.add("PHP");
        a1.add(".Net");
        a1.add("C#");
        a1.add("React Js");
        a1.add("Node Js");
        a1.add("Spring");

        //Approach 1
        Stream<String> list = a1.stream();
        boolean anyMatch = list.anyMatch((v1) -> {
            return v1.startsWith("Hibernate");//false
        });
        System.out.println(anyMatch);

        //Approach 2
        boolean value = a1.stream().anyMatch((val) -> {
            return val.startsWith("Java");//true
        });
        System.out.println(value);
    }
}
