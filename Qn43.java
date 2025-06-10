package com.ZohoQns;

public class Qn43 {
    public static void main(String[] args) {
        for(int i = 0;i<9;i++){
            for(int j = 9-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j = 0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
