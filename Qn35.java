package com.ZohoQns;

import java.util.Arrays;

public class Qn35 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 2, 6, 3, 5,4};
        int[] newArray = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            newArray[i] = arr[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
