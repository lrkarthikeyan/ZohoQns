package com.ZohoQns;

import java.util.Arrays;

public class Qn28 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 7, 5, 6, 4};
        int[] newArray = arrayModified(arr);
        System.out.println(Arrays.toString(returnTheModifiedArray(newArray)));
    }
    static int[] arrayModified(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int max = 0;
            for(int j = 1;j<arr.length-i;j++){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            int tem = arr[max];
            arr[max] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tem;
        }
        return arr;
    }
    static int[] returnTheModifiedArray(int[] arr){
        int[] newArray = new int[arr.length];
        int left = 0;
        int right = arr.length-1;
        int i = 0;
        if(arr.length/2!=0){
            while(left<right){
                int temp = arr[left];
                int temp1 = arr[right];
                newArray[i] = temp;
                i++;
                newArray[i] = temp1;
                i++;
                left++;
                right--;
            }
            int mid = arr.length/2;
            newArray[newArray.length-1] = arr[mid];
            return newArray;
        }
        else{
            while(left<right){
                int temp = arr[left];
                int temp1 = arr[right];
                newArray[i] = temp;
                i++;
                newArray[i] = temp1;
                i++;
                left++;
                right--;
            }
            return newArray;
        }
    }
}
