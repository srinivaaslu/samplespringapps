package com.test;

/**
 * Created by 205025 on 6/28/2016.
 */
public class PrimeNumbers {

    public static void main(String []args){
        for(int i =2;i<200;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }

    private static boolean isPrime(int i) {
        if(i!=2 && i%2==0)
            return false;
        for(int j=3;j*j<=i;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }

}
