package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        SinglyLinkedList myLinkedList=new SinglyLinkedList();

        myLinkedList.push_front(97, "a");
        myLinkedList.push_front(98, "b");
        myLinkedList.push_front(99, "c");
        myLinkedList.push_back(100, "d");
        myLinkedList.push_back(101, "e");
        myLinkedList.push_back(102, "f");

        myLinkedList.display_list();
        System.out.println("Number of elements inside list is: " + myLinkedList.getElement_count());



    }
}
