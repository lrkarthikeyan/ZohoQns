//Write a program to print the alphabet 'C' with the stars based on the given numbers
//Eg 1: Input: 4
package com.ZohoQns;

public class Qn52 {
    public static void main(String[] args) {
        int n = 5;
        pat(n);
    }
    private static void pat(int n){
        for(int i = 0;i<n;i++){
            for(int j = n-i-1;j>=0;j--){
                System.out.print(" ");
            }
            if (i==0 || i==n-1){
                for(int k = 0;k<n;k++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
