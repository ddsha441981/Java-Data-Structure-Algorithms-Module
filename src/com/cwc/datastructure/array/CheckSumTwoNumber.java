package com.cwc.datastructure.array;

public class CheckSumTwoNumber {

    private static int checkNumber(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j<n;j++){
                if (arr[i] + arr[j] == target){
                    ans++;

                }
            }
        }
         return ans;
    }

    private static int checkTripalNumber(int[] arr, int target) {

        int val = arr.length;
        int ans = 0;
        for(int i = 0; i<val; i++){
            for (int j =  i + 1; j <val;j++){
                for (int k = j + 1; k<val;k++){
                    if (arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        int arr[] = {6,3,1,2,8,4};
//        int target = 10;
        System.out.println(checkNumber(new int[]{6,3,1,2,8,4},10));
//        System.out.println(checkNumber(arr, target));
        System.out.println(checkTripalNumber(new int[]{6,3,1,2,8,4},10));

    }




}
