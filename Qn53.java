package com.ZohoQns;

public class Qn53 {
    public static void main(String[] args) {
        int n = 20;
        pat(n);
    }
    private static void pat(int n){
        int sum = 0;
        int row = 0;
        int k = 1;
        for(int i = 1;sum + i<=n;i++){
            sum+=i;
            row++;
        }
        for(int i = 1;i<=row;i++){
            for(int j = 0;j<row-i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
