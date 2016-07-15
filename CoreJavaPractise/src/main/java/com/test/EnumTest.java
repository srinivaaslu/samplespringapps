package com.test;

/**
 * Created by 205025 on 6/27/2016.
 */
public class EnumTest {
    public enum Days { MON, TUE, WED };
    public static void main(String[] args) {
        int mydau=0;
        for(Days d : Days.values() );
        Days [] d2 = Days.values();
        System.out.println(d2[2]);
    }
}
