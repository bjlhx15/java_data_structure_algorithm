package com.github.bjlhx15.datastructure.algorithm.jdkstruct;


import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        List a = new LinkedList<Integer>();
        System.out.println(a.size());

        int aaa = 10 >> 1;
        System.out.println(aaa);

        List a1 = new LinkedList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);
        a1.add(7);
        a1.add(8);
        a1.add(9);
        a1.add(10);
        a1.add(11);
        a1.add(12);
        a1.add(13);
        System.out.println(a1);
        a1.add(2, 99);
        System.out.println(a1);


        Map hashMap = new HashMap<String, String>();
        TreeMap<String, String> treeMap = new TreeMap<String, String>(hashMap);

    }
}
