package com.test;

/**
 * Created by 205025 on 6/27/2016.
 */
 class Rocket {
    private void blastOff() { System.out.print("bang "); }
}
public class AbstractClassSample extends Rocket {
    public static void main(String[] args) {
        new AbstractClassSample().go();
    }
    void go() {
        blastOff();
// Rocket.blastOff(); // line A
    }
    private void blastOff() { System.out.print("sh-bang "); }
}
