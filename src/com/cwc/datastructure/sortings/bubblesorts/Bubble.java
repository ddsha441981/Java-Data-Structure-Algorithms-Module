package com.cwc.datastructure.sortings.bubblesorts;

import com.cwc.datastructure.sortings.PrintArray;

public class Bubble {


    public static void main(String[] args) {
        int arr[] = {4,2,1,5,1,7,9,3,0};
        bubbleSorting(arr);
        PrintArray.printArrays(arr);

    }



    private static void bubbleSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            for (int j = 0; j<n-i-1;j++){
                //Now check value
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
