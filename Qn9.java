package com.ZohoQns;

public class Qn9 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Number 1 "+num1);
        System.out.println("Number 2 "+num2);
    }
}
