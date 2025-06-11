//Write a program to print the following pattern based on the alphabet.
//Input: E
package com.ZohoQns;

public class Qn44 {
    public static void main(String[] args) {
        nothing('E');
    }
    static void nothing(char ch){
        int len = ch - 'A';
        int z;
        char bb = 'A';
        for(char i = 0;i<=len;i++){
            z = i+1;
            for(char j = 0;j<ch-bb;j++){
                System.out.print(" ");
            }
            while(1<=z){
                System.out.print(bb+" ");
                z--;
            }
            bb++;
            System.out.println();
        }
        int k = 1;
        for(char i = --ch;i>64;i--){
            z = i-'A'+1;
            for(int j = 0;j<k;j++){
                System.out.print(" ");
            }
            k++;
            while(1<=z){
                System.out.print(i+" ");
                z--;
            }
            System.out.println();
        }
    }
}
