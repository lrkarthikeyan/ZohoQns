package com.ZohoQns;

public class BetweenPrimes {
    public static void main(String[] args) {
        int target = 30;
        int firstPrime = 0;
        int secondPrime = 0;
        for(int i = target;i>0;i--){
            int count =0;
            int num = 2;
            int sqnum = (int)Math.sqrt(i);
            while(num<=sqnum){
                if(i%num==0){
                    count++;
                    break;
                }
                else{
                    num++;
                }
            }
            if(count==0){
                firstPrime = i;
                break;
            }
        }
        for(int i = target;i>0;i++){
            int count = 0;
            int sqnum = (int)Math.sqrt(i);
            int num = 2;
            while(num<=sqnum){
                if(i%num==0){
                    count++;
                    break;
                }
                else{
                    num++;
                }
            }
            if(count==0){
                secondPrime = i;
                break;
            }
        }
        int diffForOne = Math.abs(target-firstPrime);
        int diffForSec = Math.abs(target-secondPrime);
        if(diffForOne==diffForSec){
            System.out.println(firstPrime);
        }
        else if(diffForOne<diffForSec){
            System.out.println(firstPrime);
        }
        else{
            System.out.println(secondPrime);
        }
    }
}
