//Program to Find the Largest Number Among Four Numbers
package com.ZohoQns;

public class Qn12 {
    public static void main(String[] args) {
        System.out.println(maxNumber(364,486,419,91));
    }
    static int maxNumber(int a,int b,int c,int d){
        if(a>b && a>c && a>d){
            return a;
        }
        else if(b>c && b>d){
            return b;
        }
        else if(c>d){
            return c;
        }
        else{
            return d;
        }
    }
}
