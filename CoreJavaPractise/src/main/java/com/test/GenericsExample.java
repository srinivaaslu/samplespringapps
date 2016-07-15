package com.test;

import java.util.*;

/**
 * Created by 205025 on 6/25/2016.
 */
public class GenericsExample {
    public static void main(String[] args) {
//        List<?> stringList = new ArrayList<>();
//        addUnsafe(stringList,new Integer(2));
//        addUnsafe(stringList,"Srinivas");
//        System.out.println( stringList.get(1));

        List[] objectArray = new List[8];
        objectArray[0]=new ArrayList<>();
Set<String> set1 = new HashSet<>(Arrays.asList("Tom","Krishna"));
        System.out.println( set1);

        HashMap<String,List<String>> hasMap = newHashMap();
    }

//    private static void addUnsafe(List list, Object object) {
//        list.add(object);
//    }

    public static<K,V> HashMap<K,V> newHashMap(){

        return new HashMap<K,V>();
    }
}
