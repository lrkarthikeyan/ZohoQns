package com.ZohoQns;

public class Qn58 {
    public static void main(String[] args) {
        int[] arr1 = {9,2,8,1,3,5,6,7,3,1,1,6};
        int[] arr2 = {7,8,4,6,2,1,9,9,7};
        sum(arr1,arr2);
    }
    private static void sum(int[] arr1, int[] arr2){
        int[] newArray = new int[arr1.length];
        int div = 0;
        System.arraycopy(arr1, 0, newArray, 0, arr1.length);
        for(int i = 0;i<arr1.length;i++){
            int num1 = arr2.length-1-i;
            if(num1>=0){
                int num = arr1[arr1.length-1-i] + arr2[num1]+div;
                div = num/10;
                int rem = num%10;
                newArray[arr1.length-1-i] = rem;
            }
        }
        for(int i : newArray){
            System.out.print(i+" ");
        }
    }
}
