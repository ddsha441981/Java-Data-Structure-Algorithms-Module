package com.cwc.strings;

public class StringMethods {

    public static void subStrings(String str){
        String str1 = str.substring(3);
        String str2 = str.substring(0,8);
        System.out.println("String 1 " + str1);
        System.out.println("String 2 " + str2);
    }

    public static void joinString() {
        String st = String.join("/","S","T","R","I","N","G");
        System.out.println(st);
    }

    private static void concatsString() {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));
    }

    public static void main(String[] args) {

        String greeting = "This is example of String class in java";
        //subString
        subStrings(greeting);
        //Join
        joinString();
        //Concat
        concatsString();
        //charAt
        //
    }




}
