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

    //Iterative Approach
    private static int calculateSumNaturalIterative(int number){
        int sum = 0;
        for (int i = 1;i<=number;i++){
            sum = sum + i;
        }
        return sum;
    }

    //Recursive Approach
    private static int calculateSumNaturalNumber(int number){

        if(number == 0) return 0;

        int sum = calculateSumNaturalNumber(number-1);
        sum = sum + number;
        return sum;
    }

    //Iterative Approach
    private static void printNumbers(int number){
        System.out.println(" Iterative Approach ");
        for (int i = 1;i<=number;i++){
            System.out.println(i);
        }
    }

    //Recursive Approach
    private static void printNumber(int number){
        if (number == 1){
            System.out.println(1);
            return;
        }
        printNumber(number-1);
        System.out.println(number);
    }

    public static void main(String[] args) {
        int number = 5;
//        calculateFactorialNumber(number);
//        int i = calculateFactorialRecursive(number);
//        System.out.println(i);
        System.out.println(calculateSumNaturalIterative(number));
        System.out.println(calculateSumNaturalNumber(number));
        System.out.println(" Recursive Approach ");
        printNumber(number);

        printNumbers(number);
    }
}
