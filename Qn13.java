//Program to Find the Roots of a Quadratic Equation
package com.ZohoQns;

import java.util.Scanner;

public class Qn13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = in.nextDouble();
        System.out.println("Enter b: ");
        double b = in.nextDouble();
        System.out.println("Enter c: ");
        double c = in.nextDouble();

        double discriminate = (b * b) - (4 * a * c);
        double r1 = 0;
        double r2 = 0;
        if (discriminate == 0) {
            r1 = r2 = -b / (2 * a);
            System.out.println("root1 : " + r1);
            System.out.println("root2 : " + r2);
        }
        else if (discriminate > 0) {
            r1 = (-b + Math.sqrt(discriminate)) / (2 * a);
            r2 = (-b - Math.sqrt(discriminate)) / (2 * a);
            System.out.println("root1 : " + r1);
            System.out.println("root2 : " + r2);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminate) / (2 * a);
            System.out.println("root1 : " + real + "+i" + imaginary);
            System.out.println("root2 : " + real + "-i" + imaginary);
        }
    }
}
