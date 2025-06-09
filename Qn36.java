//Java Program to find the frequency of each element
package com.ZohoQns;

import java.util.Arrays;

public class Qn36 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 4, 5};
        boolean[] br = new boolean[arr.length];
        Arrays.fill(br,true);
        for(int i = 0;i<arr.length;i++){
            if(br[i]){
                int count = 1;
                for(int j =  i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        br[j] = false;
                        count++;
                    }
                }
                System.out.println("The frequency of "+arr[i]+" is "+count);
            }
        }
    }
}
