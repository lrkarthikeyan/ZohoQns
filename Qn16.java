package com.ZohoQns;

public class Qn16 {
    public static void main(String[] args) {
        int n = 549;
        System.out.println(ans(n));
    }
    static int ans(int n){
        int max = 9;
        while(n>0){
            int rem = n%10;
            if(rem<max){
                max = rem;
            }
            n/=10;
        }
        return max;
    }
}
