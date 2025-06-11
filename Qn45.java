//Write a program to print the following output for the given input. You can assume the string is of odd length
//Input: 12345

package com.ZohoQns;

public class Qn45 {
    public static void main(String[] args) {
        String str = "12345";
        int left = 0;
        int right = str.length();
        int j;
        int i = 1;
        while(i<=right){
            j = 0;
            while(j<i){
                System.out.print(" ");
                j++;
            }
            System.out.print(str.charAt(left));
            int count = 1;
            int len = right-i;
            while(count<len){
                System.out.print("  ");
                count++;
            }
            if(i!=right){
                System.out.print(" "+str.charAt(left));
            }
            left++;
            count = 0;
            System.out.println();
            i++;
        }
    }
}
