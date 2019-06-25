package com.zipcodewilmington.singlylinkedlist;

public class MainApplication {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> myLinkedList = new SinglyLinkedList<>();

        myLinkedList.addFirst(Integer.valueOf(10));
        myLinkedList.addFirst(Integer.valueOf(12));

        System.out.println(".get(0): " + myLinkedList.getFirst());


    }
}
