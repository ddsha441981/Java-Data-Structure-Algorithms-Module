package com.cwc.datastructure.recursions;

public class FibonacciSeries {

    //Iterative Approach
    private static void printFibonacciSeries(int n){
        //n = 1 2 3 4 5 6 7 8 9 10
        int a = 0;
        int b = 1;
        int ans;
        System.out.print(" " + a + "," + b + ",");
        for (int i = 1; i <= n-2; i++){
            ans = a+b;
            System.out.print(" " + ans + ",");
            a = b;
            b = ans;
        }
    }

    //Recursive Approach
    private static int checkFibonacciServices(int nums){
        //base case
        if (nums == 0 || nums == 1){
            return nums;
        }
        //sub problems
        return checkFibonacciServices(nums-1) + checkFibonacciServices(nums-2);
//        int previous = checkFibonacciServices(nums-1);
//        int previousToPrevious = checkFibonacciServices(nums-2);
//        //self work
//        return previous + previousToPrevious;
    }

    public static void main(String[] args) {
        int nums = 10;
//        printFibonacciSeries(nums);
        for (int i = 0; i<nums;i++){
            System.out.print( " " + checkFibonacciServices(i) + "");
        }
    }

}
