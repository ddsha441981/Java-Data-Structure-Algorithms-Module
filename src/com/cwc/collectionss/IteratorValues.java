package com.cwc.collectionss;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class IteratorValues {

    public static void main(String[] args) {
        //define data here
        List<String> stringList = Arrays.asList(
                "A1",
                "B2",
                "C3",
                "D4",
                "E5"
        );
        iteratoredData(stringList);
    }

    private static void iteratoredData(List<String> stringList) {
        System.out.println(".......Approach 1...... " );
        //Approach 1
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("....... Approach 2...... " );
        //Approach 2
        ListIterator<String> stringListIterator = stringList.listIterator();
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }

        System.out.println("....... Approach 3...... " );
        //Approach 3
        for (String s : stringList) {
            System.out.println(s);
        }

        System.out.println("....... Approach 4...... " );
        //Approach 4
        for (int i = 0; i<stringList.size(); i++){
            System.out.println(stringList.get(i));
        }

        System.out.println("....... Approach 5...... " );
        //Approach 5
        stringList.forEach((d1)->{
            System.out.println(d1);
        });

        System.out.println("....... Approach 6...... " );
        //Approach 6
        stringList.stream().forEach((s)->{
            System.out.println(s);
        });
        System.out.println("....... Approach 7...... " );
        //Approach 7
        List<String> collect = stringList.stream().collect(Collectors.toList());
        System.out.println(collect);

    }
}
