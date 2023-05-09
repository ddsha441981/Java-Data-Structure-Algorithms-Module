package com.cwc.datastructure.sortings;

public class SwapNumber {
    public static  void swapNumbers(int arr[], int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
