package com.test;

import java.util.*;

/**
 * Created by 205025 on 6/28/2016.
 */
public class ListElementsCount {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("a");
        list.add("a");

        Set<String> unqueSet = new HashSet<>(list);
        for (String temp : unqueSet) {
            System.out.println("Item--" +temp+"--->"+ Collections.frequency(list, temp));
        }

        Map<String,Integer> hashMap = new HashMap<>();
        for(String temp:list){
            Integer count =hashMap.get(temp);
            hashMap.put(temp,(count== null)?1:count+1);
        }
    }
}
