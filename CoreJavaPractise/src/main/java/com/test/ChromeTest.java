package com.test;

/**
 * Created by 205025 on 6/27/2016.
 */
public class ChromeTest {
    public static void main(String[] args) {
//        X x1 = new X();
//        X x2 = new Y();
//        Y y1 = new Y();
//        x2.do1();
        X y = new X();
    }
}

class X {
    X(){
        System.out.println("HI Base Const");
    }
    {
        System.out.println("HI Base Local Const");
    }
    void do1() {
        System.out.println("HI Base");
    }
}

class Y extends X {
    static {
        System.out.println("Static  Child Local Const");
    }
    Y(){
        System.out.println("HI Child Const");
    }
    {
        System.out.println("HI Child Local Const");
    }
    void do2() {
        System.out.println("HI Child");
    }

    void do1() {
        System.out.println("HI Base inherited in child");
    }
}
