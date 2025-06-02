package com.ZohoQns;

import java.util.Scanner;

public class Qn15 {
    public static void main(String[] args) {
        System.out.println(alphabetOrNot());
    }
    static String alphabetOrNot(){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if(Character.isLetter(ch)){
            return "Alphabet";
        }
        else{
            return "Not";
        }
    }
}
