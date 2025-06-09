//Java Program to reverse the elements of an array
package com.ZohoQns;

public class Qn37 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 2, 6, 3, 5,4};
        for(int i = arr.length-1;i>=0;i--){
            if(i==arr.length-1){
                System.out.print("["+arr[i]+" ,");
            }
            else if(i==0){
                System.out.print(arr[i]+"]");
            }
            else{
                System.out.print(arr[i]+", ");
            }
        }
    }
}
