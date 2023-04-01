package com.cwc.datastructure.recursions;

public class FactorialNumber {

    //Iterative Approach
    private static void calculateFactorialNumber(int number) {
        int fact = 1;
        for (int i = 1; i<= number; i++){
            fact = i * fact;
        }
        System.out.println(fact);
    }

    //Recursive Approach
    private static int calculateFactorialRecursive(int number){
        int fact = 1;
        //base case
        if(number == 0){
            return 1;
        }
        //sub sub problem
        fact =  calculateFactorialRecursive(number-1);

        //self work
         fact = fact * number;
        return fact;

    }

    public static void main(String[] args) {
        int number = 5;
        calculateFactorialNumber(number);
        int i = calculateFactorialRecursive(number);
        System.out.println(i);
    }
}
