//Using Recursion reverse the string such as
//Input: one two three
//Output: three two one
package com.ZohoQns;

public class Qn49 {
    public static void main(String[] args) {
        String str = "be to need i GOD of kind what know i";
        int left = str.length()-1;
        int right = str.length();
        rec(str,left,right);
    }
    static void rec(String str,int left,int right){
        if(left==0){
            System.out.println(str.substring(0,right));
            return;
        }
        if(!Character.isLetter(str.charAt(left))){
            System.out.print(str.substring(left+1,right)+" ");
            right = left;
            rec(str,left-1,right);
        }
        else{
            rec(str,left-1,right);
        }
    }
}
