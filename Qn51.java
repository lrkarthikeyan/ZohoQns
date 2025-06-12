//Write a program to sort the elements in odd positions in descending order
//and elements in ascending order.
//Input : 13, 2, 4, 15, 12, 10, 5
//Output : 13, 2, 12, 15, 5, 10, 4
package com.ZohoQns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Qn51 {
    public static void main(String[] args) {
        int[] arr = {13,2,4,15,12,10,5};
        System.out.println(Arrays.toString(changingTheOddNumsToDesc(arr)));
    }
    static int[] changingTheOddNumsToDesc(int[] arr){
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0;i<arr.length;i+=2){
            arr1.add(arr[i]);
        }
        Collections.sort(arr1,Collections.reverseOrder());
        int j = 0;
        for(int i = 0;i<arr.length;i+=2){
            arr[i] = arr1.get(j);
            j++;
        }
        return arr;
    }
}
