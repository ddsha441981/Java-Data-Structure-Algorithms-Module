package com.cwc.strings;

public class ReverseString {

  private static String reverseStrings(String str){

      String arr[]=str.split(" ");
      for(int i=0;i<arr.length;i++)
      {

          for(int j=arr[i].length()-1;j>=0;j--)
          {
              System.out.print(arr[i].charAt(j));
          }
          System.out.print(" ");
      }

      return str;
  }

    public static void main(String[] args) {
        String s1 = "My name is sofil ansari";
        reverseStrings(s1);
    }
}
