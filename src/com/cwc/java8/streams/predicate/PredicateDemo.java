package com.cwc.java8.streams.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (t)->{
            if (t % 2 == 0){
                return true;
            }else{
                return false;
            }
        };
        System.out.println(predicate.test(100));

        //Example 2

        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> predicate1 = (x)->x>5;
        Predicate<Integer> predicate2 = (x)->x<8;
        lists.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList()).forEach(System.out::println);
    }
}
