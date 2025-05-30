package com.ZohoQns;

import java.util.Scanner;

//Write a program to find the perimeter of the square
public class Qn2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the whole area of the square : ");
        double areaOfSq = scan.nextDouble();
        System.out.println("The Perimeter of the Square is "+areaOfSq/4);
    }
}
