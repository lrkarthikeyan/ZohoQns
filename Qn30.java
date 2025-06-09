//Java Program to find the sum of elements of an array present on even position.
package com.ZohoQns;

public class Qn30 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 2, 6, 3, 5,4};
        System.out.println(evenNumber(arr));
    }
    static int evenNumber(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            if(i%2!=0){
                sum += arr[i];
            }
        }
        return sum;
    }

}
