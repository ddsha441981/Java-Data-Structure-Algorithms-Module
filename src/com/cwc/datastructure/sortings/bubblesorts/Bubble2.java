package com.cwc.datastructure.sortings.bubblesorts;

import com.cwc.datastructure.sortings.PrintArray;

public class Bubble2 {
    private static void bubbleSorting(int[] arr) {
        for (int i = 0; i<= arr.length-1;i++){
            for (int j = i + 1; j<=arr.length-1;j++){
                if (arr[i] > arr[j]){
                    swapNumbers(arr,i,j);
                }
            }
        }
    }

    private static void swapNumbers(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {4,6,0,8,0,1,2,7,9,3,5};
        bubbleSorting(arr);
        PrintArray.printArrays(arr);
    }
}
