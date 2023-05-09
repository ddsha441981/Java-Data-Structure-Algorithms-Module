package com.cwc.java8.streams.terminal;

import java.util.ArrayList;
import java.util.List;

public class AllMatch {

    public static void main(String[] args) {

        List<String> arr1 = new ArrayList<>();
        arr1.add("Java");
        arr1.add("PHP");
        arr1.add(".Net");
        arr1.add("C#");
        arr1.add("React Js");
        arr1.add("Node Js");
        arr1.add("Spring");
        boolean allMatch = arr1.stream().allMatch((r1) -> {
            return r1.contains("Js");
        });
        System.out.println(allMatch);
    }
}
