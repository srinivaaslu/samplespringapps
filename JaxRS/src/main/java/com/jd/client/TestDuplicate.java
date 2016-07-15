package com.jd.client;

/**
 * Created by 205025 on 6/13/2016.
 */
public class TestDuplicate {

    public static void main(String []args){
        int arrayWithElement[] = new int[]{10,3,5,10,5,4,6,6};
        String distinctElement = "";
        String duplicateElement = "";
        for(int i =0; i<arrayWithElement.length;i++){
            if(i==0)
                distinctElement+=arrayWithElement[i]+" ";
            else if(distinctElement.contains(" " + arrayWithElement[i])){
                duplicateElement+=arrayWithElement[i]+" ";
            }else{
                distinctElement+=arrayWithElement[i]+" ";
            }
        }
        System.out.println("Duplicate are--"+duplicateElement.toString());
    }
}
