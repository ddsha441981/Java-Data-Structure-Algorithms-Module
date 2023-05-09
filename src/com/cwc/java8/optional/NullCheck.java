package com.cwc.java8.optional;

import java.util.Optional;

public class NullCheck {

    public static void main(String[] args) {
        String name = "Deendayal";
        String name1 = null;
        //System.out.println(Optional.of(name));//Optional[Deendayal]
        //System.out.println(Optional.of(name1));//NullPointerException
        //System.out.println(Optional.ofNullable(name));//Optional[Deendayal]
        //System.out.println(Optional.ofNullable(name1));//Optional.empty
//        if (Optional.ofNullable(name1).isPresent()){
//            System.out.println(name.toUpperCase());//DEENDAYAL
//        }
//        if (Optional.ofNullable(name1).isEmpty()){
//            System.out.println(name1);//null
//        }

        System.out.println(Optional.ofNullable(name).orElse("Default"));//Deendayal
        System.out.println(Optional.ofNullable(name1).orElse("Default"));//Default

        // 1. orElse used in Post method when data comes from fronted and some data will not present then we can pass default data
        // 2. Whenever in DB fetch some data and we check null value

        String s1 = Optional.ofNullable(name1).orElseThrow(() -> new RuntimeException("Some exception"));
        System.out.println(s1);
    }
}
