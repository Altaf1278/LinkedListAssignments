package com.bridgelabz.linkedlistassignments;

import java.util.LinkedList;
import java.util.List;

public class LinkedListAssignment {
    public static void main(String[] args) {
LinkedListAssignment demo = new LinkedListAssignment();
demo.toAddElements();
    }
    public void toAddElements(){
        List<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(70);

        for (int element : list){
            System.out.println(element);
        }
       /* for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            System.out.println(element);
        }*/
    }
}
