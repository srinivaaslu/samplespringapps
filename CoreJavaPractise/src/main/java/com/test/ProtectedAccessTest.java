package com.test;

import com.test.subpackage.Parent;

/**
 * Created by 205025 on 7/3/2016.
 */
public class ProtectedAccessTest extends Parent {
    static Size s;
    public void test(){
    System.out.print("+Value is "+x);
        Parent p = new Parent();
    }
    protected void draw(){
        System.out.println("Child");
    }
    public void testItself(){
        System.out.println("Child Tresting");
    }
    public static void testStatic(){
        System.out.println("Child Statc Testing");
    }
    public void nonStatic(){
        testStatic();
    }
    public static void main(String []args){
        Parent protectedAccessTest= new ProtectedAccessTest();
        ((ProtectedAccessTest)protectedAccessTest).draw();
        System.out.print(s.SMALL.size);
        testStatic();
    }


}
enum Size{
    LARGE(5),SMALL(2);
    int size;
    Size(int i) {
        this.size=i;
    }
}
