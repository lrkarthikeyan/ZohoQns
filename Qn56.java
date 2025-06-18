package com.ZohoQns;

import java.util.ArrayList;
import java.util.List;

public class Qn56 {
    public static void main(String[] args) {
        String str = "abc";
        List<String> list = new ArrayList<>();
        subset(list,str,new StringBuilder(),0);
        for(String lit: list ){
            System.out.println(lit);
        }
    }
    private static void subset(List<String> arr,String str,StringBuilder temp, int start){
        arr.add(temp.toString());
        for(int i = start;i<str.length();i++){
            temp.append(str.charAt(i));
            subset(arr, str, temp,i+1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
