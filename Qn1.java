package com.ZohoQns;
//Write a program to print the binary, octal, hexadecimal value of an integer
public class Qn1 {
    public static void main(String[] args) {
        int num = 108;
        System.out.println(binary(num));
        System.out.println(octal(num));
        System.out.println(hexaDecimal(num));
    }

    static int binary(int num) {
        String result = "";
        while (num > 0) {
            result = (num % 2) + result;
            num /= 2;
        }
        return Integer.parseInt(result);
    }
    static int octal(int num) {
        String str = "";
        while (num > 0) {
            str = (num % 8) + str;
            num /= 8;
        }
        return Integer.parseInt(str);
    }
    static String hexaDecimal(int num){
        String str = "";
        char[] ch = "0123456789ABCDEF".toCharArray();
        while (num > 0) {
            str = (ch[num % 16]) + str;
            num /= 16;
        }
        return str;
    }
}
//}
