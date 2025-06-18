package com.ZohoQns;

public class Qn55 {
    public static void main(String[] args) {
        int n = 4;
        int row = 2 * n-1;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<row;j++){
                int min = Math.min(Math.min(i,j),Math.min(row-i-1,row-j-1));
                if(n-min==10){
                    System.out.print(n-min + " ");
                }
                else{
                    System.out.print(n-min+ "  ");
                }
            }
            System.out.println();
        }
    }
}
