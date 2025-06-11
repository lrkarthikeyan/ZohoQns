//write a program to find the sum of given number and it's reverse number.
package com.ZohoQns;

public class Qn48 {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(revPlusAdd(num));
    }
    static int revPlusAdd(int num){
        int original = num;
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev * 10 +rem;
            num/=10;
        }
        return original+rev;
    }
}
