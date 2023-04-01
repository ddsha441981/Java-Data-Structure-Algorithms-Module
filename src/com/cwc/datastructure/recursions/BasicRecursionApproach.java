package com.cwc.datastructure.recursions;

public class BasicRecursionApproach {
    //Iterative Approach
    private static int calculateSumNaturalIterative(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    //Recursive Approach
    private static int calculateSumNaturalNumber(int number) {

        if (number == 0) return 0;

        int sum = calculateSumNaturalNumber(number - 1);
        sum = sum + number;
        return sum;
    }

    //Iterative Approach
    private static void printNumbers(int number) {
        System.out.println(" Iterative Approach ");
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    //Recursive Approach
    private static void printNumber(int number) {
        if (number == 1) {
            System.out.println(1);
            return;
        }
        printNumber(number - 1);
        System.out.println(number);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(calculateSumNaturalIterative(number));
        System.out.println(calculateSumNaturalNumber(number));
        System.out.println(" Recursive Approach ");
        printNumber(number);
    }
}
