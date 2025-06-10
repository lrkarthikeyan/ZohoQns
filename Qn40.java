//Java Program to inverse the elements of an array.
package com.ZohoQns;

import java.util.Arrays;

public class Qn40 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,5,4,89,6,746,8};
        int[] arr1 = new int[arr.length];
        int j = 0;
        for(int i =arr.length-1;i>=0;i--){
            arr1[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
