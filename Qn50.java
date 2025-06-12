//Write a program to output the number in words (0-999)
//Input: 234
//Output: Two hundred and Thirty Four
package com.ZohoQns;

import java.util.Scanner;

public class Qn50 {
    public static void main(String[] args) {
        String[] teens = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
        String[] huns = {"", "One Hundred and ", "Two Hundred and ", "Three Hundred and ", "Four Hundred and ",
                "Five Hundred and ", "Six Hundred and ", "Seven Hundred and ", "Eight Hundred and ", "Nine Hundred and "};
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        convertNumberToWord(teens,tens,huns,num);
    }
    static void convertNumberToWord(String[] teens, String[] tens,String[] huns,int num){
        if(num==0){
            System.out.println("Zero");
        }
        while(num>0){
            int digitCount = num;
            int count = 0;
            while(digitCount>0){
                digitCount/=10;
                count++;
            }
            if(count==3){
                int firstNum = num/100;
                System.out.print(huns[firstNum]);
                num%=100;
            }
            else if(count==2 && num>19){
                int firstNum = num/10;
                System.out.print(tens[firstNum]);
                num%=10;
            }
            else if(num<10){
                System.out.print(teens[num]);
                num/=10;
            }
            else {
                int firstNum = num/10;
                System.out.print(tens[firstNum]);
                num%=10;
            }
        }
    }
}
