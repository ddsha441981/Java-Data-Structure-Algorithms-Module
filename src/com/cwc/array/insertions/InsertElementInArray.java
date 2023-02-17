package com.cwc.array.insertions;

public class InsertElementInArray {

    public static void insertElement(char[] ar, int position,char value){
        for(int i = ar.length-1; i>position;i--){
            //Moving each element one position to its right
            ar[i] = ar[i-1];
        }
        //Inserting the data at the specified position
        ar[position-1] = value;
    }

    public static void main(String[] args) {
        char arr[] = new char[6];
        arr[0] = 'A';
        arr[1] = 'B';
        arr[2] = 'C';
        arr[3] = 'D';
        arr[4] = 'E';
        InsertElementInArray.insertElement(arr,3,'J');
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
