package com.test;

/**
 * Created by 205025 on 6/25/2016.
 */
public class EnumUsage {
    public static void main(String []args){
    Currency currency = Currency.DIME;
        switch (currency){
            case PENNY:
            System.out.println(currency);
                break;
            case DIME:
                System.out.println(currency+" its value"+currency.getValue()+" Color "+currency.color());
                break;
            case QUARTER:
                System.out.println(currency.color());

        }
    }
}