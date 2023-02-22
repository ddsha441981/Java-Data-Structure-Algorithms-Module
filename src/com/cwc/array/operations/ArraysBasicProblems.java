package com.cwc.array.operations;

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

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num1 = 3;
        int num2 = 5;
        //swapNumbers(num1,num2);
       //swapWithoutUseThirdVar(num1,num2);
        int[] ans = reverseArray(arr);
        printArray(ans);

    }


}
