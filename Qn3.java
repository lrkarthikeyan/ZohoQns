package com.ZohoQns;
//Write a program to find the Perimeter of the Rectangle
import java.util.Scanner;

public class Qn3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Length of the Rectangle : ");
        double len = scan.nextDouble();
        System.out.print("Enter the Breadth of the Rectangle : ");
        double brea = scan.nextDouble();
        int ans = (int)(2*(len+brea));
        System.out.println("The Perimeter of The Rectangle is "+ans);
    }
}
