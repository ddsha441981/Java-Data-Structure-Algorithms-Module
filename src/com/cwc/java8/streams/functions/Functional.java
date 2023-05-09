package com.cwc.java8.streams.functions;

import java.util.function.Function;

public class Functional {

    public static void main(String[] args) {

        Function<String,Integer> function = (t)->t.length();
        System.out.println(function.apply("Deendayal"));

        //Check Even odd
        Function<Integer ,String> function1 = (number)->{
          if (number % 2 == 0){
              return number + " Even Number ";
          }else {
              return number + " Odd Number";
          }
        };
        System.out.println(function1.apply(10));
    }
}
