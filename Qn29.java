package com.ZohoQns;

public class Qn29 {
    public static void main(String[] args) {
        int num = 5;
        int fact = factorialOfANumber(num);
        System.out.println("Factorial of "+num+" is "+fact);
        System.out.println("Reverse of that factorial "+"is "+reverseOfANumber(fact));
    }
    static int factorialOfANumber(int num){
        int sum = 1;
        for(int i = num;i>1;i--){
            sum *= i;
        }
        return sum;
    }
    static int reverseOfANumber(int num){
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum * 10 + rem;
            num/=10;
        }
        return sum;
    }
}
