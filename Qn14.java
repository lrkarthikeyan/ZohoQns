package com.ZohoQns;

public class Qn14 {
    public static void main(String[] args) {
        System.out.println(positiveOrNegative(-1));
    }
    static String positiveOrNegative(int n){
        if(n<0){
            return "Negative";
        }
        else{
            return "Positive";
        }
    }
}
