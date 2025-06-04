package com.ZohoQns;

import java.util.ArrayList;
import java.util.Arrays;

public class Qn26 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,5,6,7,9,10,13};
        int[] arr2 = {2,3,4,5,6,7,8,9,11,15};
        int[] mergedArray = new int[arr1.length+arr2.length];
        int i = 0;
        for(;i< arr1.length;i++){
            mergedArray[i] = arr1[i];
        }
        int k = 0;
        for(int j =i;j<mergedArray.length;j++){
            mergedArray[j] = arr2[k];
            k++;
        }
        Arrays.sort(mergedArray);
        int countFroOriginal = 1;
        int countForDuplicate = 0;
        for(int j = 0;j<mergedArray.length-1;j++){
            if(mergedArray[j]!=mergedArray[j+1]){
                countFroOriginal++;
            }
            else{
                countForDuplicate++;
            }
        }
        int[] realMergedArray = new int[countFroOriginal];
        int[] realDuplicateArray = new int[countForDuplicate];
        k = 0;
        int z = 0;
        for(int j = 0;j<mergedArray.length-1;j++){
            if(mergedArray[j]!=mergedArray[j+1]){
                realMergedArray[k] = mergedArray[j];
                k++;
            }
            else{
                realDuplicateArray[z] = mergedArray[j];
                z++;
            }
        }
        realMergedArray[realMergedArray.length-1] = mergedArray[mergedArray.length-1];
        System.out.println(Arrays.toString(realMergedArray));
        System.out.println(Arrays.toString(realDuplicateArray));
    }
}
