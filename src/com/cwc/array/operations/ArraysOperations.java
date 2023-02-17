package com.cwc.array.operations;

public class ArraysOperations {

    private static void sumValueOfArrays(int[] arr) {

        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of Array" + sum);

    }

    private static void checkLargestNumber(int[] arr) {
        int largeNumber = 0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]>largeNumber){
                largeNumber = arr[i];//update value
            }
        }
        System.out.println("Largest Number is " + largeNumber);
    }

    private static void searchValueGivenArray(int[] arr){
        int xValue = 7;
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == xValue){
                ans = i;
                break;
            }
        }
        if(ans == -1){
            System.out.println("Not Found");
        }else {
            System.out.println("Found " + xValue + " Index " + ans);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int [] arr2 = {45,12,67,2,4,7,8};
        int [] arr3 = {45,12,67,2,4,7,8};
        arr1[0] = 56;
        arr1[1] = 35;
        arr1[2] = 51;
        arr1[3] = 54;
        arr1[4] = 15;


        ArraysOperations.sumValueOfArrays(arr1);
        ArraysOperations.checkLargestNumber(arr2);
        ArraysOperations.searchValueGivenArray(arr3);
    }


}
