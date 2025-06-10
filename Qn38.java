//Java Program to print the delete an element of an array
package com.ZohoQns;

import java.util.ArrayList;
import java.util.Arrays;

public class Qn38 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,5,4,89,6,746,8};
        ArrayList<Integer> newArray = new ArrayList<>();
        int k = 8;
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=k){
                newArray.add(arr[i]);
                j++;
            }
        }
        int[] arr1 = new int[newArray.size()];
        for(int i = 0;i<newArray.size();i++){
            arr1[i] = newArray.get(i);
        }
        System.out.println(Arrays.toString(arr1));
    }
}
