package com.cwc.datastructure.array.operations;

public class ArraysBasicProblems {

    private static void swapNumbers(int num1,int num2) {
        System.out.println("Before Swap Numbers " );
        System.out.println("Num1 : " + num1 );
        System.out.println("Num2 : " + num2 );
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swap Numbers " );
        System.out.println("Num1 : " + num1 );
        System.out.println("Num2 : " + num2 );
    }

    private static void swapWithoutUseThirdVar(int num1,int num2){
        System.out.println("Before Swap Numbers " );
        System.out.println("Num1 : " + num1 );
        System.out.println("Num2 : " + num2 );
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swap Numbers " );
        System.out.println("Num1 : " + num1 );
        System.out.println("Num2 : " + num2 );

    }

    private static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[5];
        int j = 0;
        for (int i = n-1; i>=0;i--){ //n-1 last index of array
//            ans[j++] = arr[i];
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }

    private static void reverseArrayInPlace(int[] arr){
        int i = 0; int j = arr.length-1;
        while(i<j){ //i is indexed of 0 and j is last indexed of array
            swapArrayElements(arr,i,j);
            i++;
            j--;

        }
    }

    private static void swapArrayElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[i] =  arr[j];
        arr[j] = temp;
    }

    private static void printArrayTable(int[] arr){
        int result = 0;
        for (int i = 0;i<=arr.length; i++){
            for (int j = 1; j<=10; j++){
                 result = i * j;
                System.out.print(result + " ");
            }
            System.out.println();
        }


    }

    private static void checkEvenNumber(int[] arr){
        int n = arr.length;
        int result = 0;
        for (int i = 0; i<n; i++){
            if(i / 2 == 0){
                result = i;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num1 = 3;
        int num2 = 5;
        //swapNumbers(num1,num2);
       //swapWithoutUseThirdVar(num1,num2);
//        int[] ans = reverseArray(arr);
//        printArray(ans);
//        reverseArrayInPlace(arr);
//        printArray(arr);
//        printArrayTable(arr);
        checkEvenNumber(arr);
    }


}
