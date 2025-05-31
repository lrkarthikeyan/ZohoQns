package com.ZohoQns;
//Program to print the ASCII Value of all Alphabets
public class Qn6 {
    public static void main(String[] args) {
        int j = 0;
        for(int i = 'A';i<='Z';i++){
            char[] ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
            System.out.println(ch[j]+" = "+i);
            j++;
        }
        j = 0;
        for(int i = 'a';i<='z';i++){
            char[] ch = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            System.out.println(ch[j]+" = "+i);
            j++;
        }
    }
}
