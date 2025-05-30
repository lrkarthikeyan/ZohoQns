package com.ZohoQns;

import java.util.Scanner;

public class Qn4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius of the Cylinder ");
        int rad = scan.nextInt();
        double ans = 2*3.14*rad;
        System.out.println("The Circumference of the Cylinder is "+ans);
    }
}
