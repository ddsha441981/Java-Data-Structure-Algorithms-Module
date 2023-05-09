package com.cwc.datastructure.sortings.selection;

import com.cwc.datastructure.sortings.PrintArray;
import com.cwc.datastructure.sortings.SwapNumber;

public class SelectionSort {
    private static void selectionSorted(int[] arr) {
        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            for (int j = i+1; j<=n-1;j++){
//                System.out.println(arr[i]  + arr[j]);
                if (arr[i]>arr[j]){
                    SwapNumber.swapNumbers(arr,i,j);
//                    System.out.println(i + j);
                }
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {8,5,0,7,9,1,4,6,2,3};
        selectionSorted(arr);
        PrintArray.printArrays(arr);
    }
}
