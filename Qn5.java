package com.ZohoQns;
//Write a single program to generate a division and addition table for a given number.
public class Qn5 {
    public static void main(String[] args) {
        int num = 10;
        for(int i=1;i<=num;i++){
            System.out.println(i+" + "+num+" = "+(i+num));
        }
        for(int i=1;i<=num;i++){
            System.out.println(i+" / "+num+" = "+(i/num));
        }
    }
}
