package com.cwc.array.operations;

import java.util.Scanner;

public class PairGroupArray {

    public static  int checkTwoPairNumber(int[] arr , int targetVal){
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i<n;i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] + arr[j] == targetVal){
                    ans++;
                }
            }
        }
        return ans;
    }

    private static int checkTripalPairNumber(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i<n; i++){//first Number
            for (int j = i+1; j<n; j++){//second number
                for (int k = j+1; k<n; k++){//third number
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    private static int checkUniqueNumber(int[] arr){
        int n = arr.length;
        int check = -1;
        for (int i = 0; i < n; i++){ // first loop to check first element
            for(int j = i + 1; j < n; j++){// second loop to check second element
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
//        Again Traverse array to find positive element
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){ // check positive number
                check = arr[i];
            }
        }
        return check;
    }

    private static int findMaxValue(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    private static int findSecondMax(int[] arr){
        int max =  findMaxValue(arr);
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;//hide value (mark value as small)
            }
        }
        //now again call max method
        int secondMax = findMaxValue(arr);
        return secondMax;
    }

    private static int findFirstRepeatingValue(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            for(int j = i + 1; j<n; j++){
                if(arr[i] == arr[j]){
                   return arr[i];//found
                }
            }
        }
        return -1;//not found
    }

    private static int findLastRepeatingValue(int[] arr){
        int n = arr.length;
        int lastValue = -1;
        for(int i = 0; i<n; i++ ){
            for (int j = i +1; j<n; j++){
                if(arr[i] == arr[j]){
                    lastValue = arr[i];
                }
            }
        }
        return lastValue;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrays size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter arrays element");
        for (int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("Enter target sum value");
//        int target = sc.nextInt();

//        System.out.println("Two Number Pair : " + checkTwoPairNumber(arr, target));
//        System.out.println("Tripal Number Pair : " + checkTripalPairNumber(arr, target));
//        System.out.println("Unique Number is : " + checkUniqueNumber(arr));
//        System.out.println("Second Max Number is : " + findSecondMax(arr));
//        System.out.println("First Repeating value is : " + findFirstRepeatingValue(arr));
//        System.out.println("Last Repeating element is : " + findLastRepeatingValue(arr));

    }




}
