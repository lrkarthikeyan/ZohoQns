package com.ZohoQns;
import java.util.Scanner;
public class Qn18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius of the outer circle (R): ");
        double R = scan.nextDouble();
        System.out.print("Enter radius of the inner circle (r): ");
        double r = scan.nextDouble();
        if (R > r) {
            double area = Math.PI * (R * R - r * r);
            System.out.println("Area between the circles: " + area);
        } else {
            System.out.println("Outer radius must be greater than inner radius.");
        }
    }
}
