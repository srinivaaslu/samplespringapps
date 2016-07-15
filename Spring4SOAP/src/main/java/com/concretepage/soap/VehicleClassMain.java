package com.concretepage.soap;

/**
 * Created by 205025 on 6/30/2016.
 */
public class VehicleClassMain {
    public static void main(String []args){
        Shape rectangle = new Shape();
        Shape square = new Shape();
        rectangle.length= 12;
        rectangle.width =10;
        rectangle.height =8;
        System.out.println("Height rectangle is "+rectangle.height);
        rectangle.area();
        square.length = 5;
        square.width = 5;
        square.height =5;
        square.area();
        System.out.println("Height of square "+square.height);

    }
}
class Shape{
    int length;
    int width;
    int height;
    public void area(){
        System.out.println("Area is "+length*width);
    }
}
