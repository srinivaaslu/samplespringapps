package com.test;

/**
 * Created by 205025 on 6/27/2016.
 */
public class RedWood extends Tree {
    public static void main(String[] args) {
        new RedWood().go();
    }

    void go() {
        go2(new Tree(), new RedWood());
        go2((RedWood) new Tree(), new RedWood());
    }

    void go2(Tree t1, RedWood r1) {
        RedWood r2 = (RedWood) t1;
        Tree t2 = (Tree) r1;
    }
}

class Tree {
}