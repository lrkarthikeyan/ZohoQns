package com.ZohoQns;
//Check a number is Even or Odd
import java.util.Scanner;

public class Qn10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check even or odd ");
        int num = scan.nextInt();
        if(num%2==0){
            System.out.println("The number is Even ");
        }
        else{
            System.out.println("The number is Odd ");
        }
    }
}
