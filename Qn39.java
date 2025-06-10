//Java Program to print the average of all items of the array
package com.ZohoQns;

public class Qn39 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,5,4,89,6,746,8};
        int i = 0;
        int sum = 0;
        while(i<arr.length){
            sum += arr[i];
            i++;
        }
        int avg = sum/arr.length;
        System.out.println(avg);
    }
}
