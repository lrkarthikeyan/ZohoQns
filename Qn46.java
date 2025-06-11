//Write a program to find the odd numbers in between the range.
//Input:2
//Output:15

package com.ZohoQns;

public class Qn46 {
    public static void main(String[] args) {
        int left = 2;
        int right = 15;
        while(left<=right){
            if(left%2!=0 && left==right){
                System.out.print(left);
            }
            else if(left%2!=0){
                System.out.print(left+", ");
            }
            left++;
        }
    }
}
