package com.ZohoQns;

final class Animal{
    public static final int cat(){
        return 5;
    }
//    public static int cat(){
//
//    }
}

//class dog extends Animal{ we can't inherit it cause the Animal class is final
//
//}

public class Qn25 {
    public static void main(String[] args) {
        final int k = 10;
         // will shows error k = 20;
        int ans = Animal.cat();
        System.out.println(ans);

    }
}

