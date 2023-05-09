package com.cwc.datastructure.searching.binary;

public class SearchingAlgo {

    private static  int linearSearchAlgorithm(int[] ar ,int targetX){
        //There is no need to sort of array
        int n = ar.length;
        for (int i = 0; i<n; i++){
            //Now Check target Value
            if (ar[i] == targetX)
               return i;
        }
        return -1;
    }
    //work on sorted array only
    private static int binarySearchAlgorithm(int[] arr, int targetX){
        int right = arr.length-1;
        int left = 0;
        while (left <= right){//0<=right
            //calculate midpoint array
            int mid = (left + right)/2;
            //check target value with midpoint
            if (arr[mid] == targetX)
                return mid;
            //target value is small of mid then skip greater number of mid
            else if (targetX < arr[mid])
                right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(linearSearchAlgorithm(new int[] {4,6,7,1,2,8,0,2,4},0));
        System.out.println(binarySearchAlgorithm(new int[]{1,2,3,4,5,6,7,7,7,8},7));
    }
}
