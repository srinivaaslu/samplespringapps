package com.test;

/**
 * Created by 205025 on 6/25/2016.
 */
public enum Currency {
    PENNY(1) {
        @Override
        public String color() {
            return null;
        }
    },NICKLE(5){
        @Override
        public String color(){
            return "Balck";
        } ;
    },DIME(10) {
        @Override
        public String color() {
            return "Super Color";
        }
    },QUARTER(25){
        @Override
    public String color(){
            return "Blue";
        }
    };
    private int value;
    public abstract String color();
    Currency(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
