//Java program to print the 2nd Largest Element in the array
package com.ZohoQns;

public class Qn32 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 2, 6, 3, 5,4};
        System.out.println(bubbleSort(arr));
    }
    static int bubbleSort(int[] arr){
        for(int i = 0;i<2;i++){
            for(int j = 1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-2];
    }
}
