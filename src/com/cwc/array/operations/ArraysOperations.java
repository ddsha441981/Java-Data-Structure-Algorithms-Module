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

    private static void multiplyArray(int[] arr) {
        int result = 1;
        for(int i = 0; i < arr.length; i++){
            result = result * arr[i];
        }
        System.out.println(result);
    }

    private static void numberTable(int[] arr){
        int result = 0;
        for (int i = 1; i<=40.;i++) {
            System.out.print(i+ "\t");
        }
           for (int j = 1; j <= 2; j++){
               System.out.println("---");
//               System.out.print("");
               for (int k = 1; k <= 10;k++){
                   result = j * k;
                   System.out.println(result + " ");
               }

           }

    }

    private static void printArray(int[] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    private static void printValue(int val) {
        int a = 1001;
        System.out.println("");
    }

    private static void changeArray(int[] arr) {
        for (int i = 0; i< arr.length; i++){
           arr[i] = 0;
        }
    }

    private static void findXValue(int[] arr, int x){
        int count = 0;
        for (int i = 0; i<arr.length;i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println("Found X " + count + " times  in array");
    }

    private static  void findLastOccurrence(int[] arr , int x){
        int lastIndex = -1;
        for (int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        System.out.println( " " +lastIndex);

    }

    private static void findStrictlyGreaterThanValueX(int[] ar, int x) {
        int count = 0;
        for (int i =0 ; i<ar.length;i++){
            if (ar[i] > x){
                count++;
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;
        int[] arr1 = new int[5];
        int [] arr2 = {45,12,67,2,4,7,8};
        int [] arr3 = {45,12,67,2,4,7,8};
        int [] arr4 = {1,2,3,4,5};
        arr1[0] = 56;
        arr1[1] = 35;
        arr1[2] = 51;
        arr1[3] = 54;
        arr1[4] = 15;


        sumValueOfArrays(arr1);
        checkLargestNumber(arr2);
        searchValueGivenArray(arr3);
        multiplyArray(arr3);
        //numberTable(arr4);

        System.out.println("Original Array ");
        printArray(arr);
        //copy array Shallow copy
        int[] arr_2 = arr;
        System.out.println("Copied  Array ");
        printArray(arr_2);//print after copy of array

        // Changing value of array2
        arr_2[0] = 0;
        arr_2[1] = 0;
        arr_2[2] = 7;
        arr_2[3] = 8;
        arr_2[4] = 9;
        //shallow copy
        System.out.println("Before Changing values of Original Array");
        printArray(arr); // value going to change in original array because reference different but memory address is same
        System.out.println("After Changing values of array 2");
        printArray(arr_2);


        //Pass by value
        int a = 5;
        printValue(a);
        System.out.println(a); //value will not affect because java support pass by value and
                                // values stored in stack(primitive data) so values store in stack not
                                 // heap that why only change in copy not in original value

        System.out.println("Before changing of array");
        printArray(arr);

        changeArray(arr);
        System.out.println("After changing array values ");
        printArray(arr);


        //deep Copy
        // Inside heap array create a  different copy with different addresses and references(stack)
        int[] arr_3 = arr.clone();
        printArray(arr_3);


        //find x value
        int [] ar = {3,4,3,7,9,2};
        int [] a1 = {2,3,1,3,4,1};
        int x = 3;
        findXValue(ar,x);

        findLastOccurrence(ar,x);
        findStrictlyGreaterThanValueX(a1,x);
    }




}
