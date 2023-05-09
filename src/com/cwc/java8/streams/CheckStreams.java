package com.cwc.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CheckStreams {

    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(20, 2, 3, 4, 5, 1, 6, 2, 7, 8, 3, 0, 2);

        //Predicate filter

//       asList.stream().filter((x) -> x % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
//       asList.stream().map((x)->x * 2).collect(Collectors.toList()).forEach(System.out::println);
//       asList.stream().map(x->x * 2).filter(m->m % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
//        Optional<Integer> any = asList.stream().map(x -> x + 1).findAny();
//        System.out.println(any);
//        Optional<Integer> first = asList.stream().map(x -> x / 2).findFirst();
//        System.out.println(first);

        asList.stream().sorted().forEach(System.out::println);

    }
}
