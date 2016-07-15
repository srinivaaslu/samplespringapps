package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 205025 on 6/24/2016.
 */
public class ComparatorExample {
    public static void main(String []args){
        List<EmpClass> empList = new ArrayList<EmpClass>();
        empList.add(new EmpClass("Srinivas","Vankam","DML",34));
        empList.add(new EmpClass("Srinivas1","Vankam1","DML1",34));
        empList.add(new EmpClass("Srinivas2","Vankam2","DML2",34));
        empList.add(new EmpClass("Srinivas3","Vankam3","DML3",34));
        empList.add(new EmpClass("Srinivas4","Vankam4","DML4",34));
        Collections.sort(empList);
System.out.println(empList.get(1).getUserName());
    }


}

