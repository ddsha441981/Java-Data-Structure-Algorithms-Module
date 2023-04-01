package com.cwc.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2);//true

        //String with new operator
        String t1 = new String("Hello");
        String t2 = new String("Hello");
        System.out.println(t1.equals(t2)); //true because String class internally use equal method and .equal() always content comparison
        System.out.println(t1==t2);//false because == operator always check references of given object (memory address)
        System.out.println(s1==t2);//false
        System.out.println(s2.equals(t1));//true

        List<String> stringsList = Arrays.asList(
                "AA", "BBB", "CCCC", "FFFFF", "DDDDDD"
        );
        String str1 = "CCCC";

        for (String str : stringsList){
            if (str.equals(str1))

                System.out.println("Present");
        }
    }
}
