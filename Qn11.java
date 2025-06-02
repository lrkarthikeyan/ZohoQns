//Program to Check Whether a Character is a Vowel or Consonant
package com.ZohoQns;

import java.util.Scanner;

public class Qn11 {
    public static void main(String[] args) {
        System.out.println(vowelOrNot());
    }
    public static String vowelOrNot(){
        char[] ch = "aeiou".toCharArray();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Char you wanna find thats vowel or not ");
        char vow = scan.next().charAt(0);
        vow = Character.toLowerCase(vow);
        for(int i=0;i<ch.length;i++){
            if(vow==ch[i]){
                return "Its an Vowel";
            }
        }
        return "Its a Consonant";
    }
}
