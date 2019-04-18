package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        SinglyLinkedList myLinkedList=new SinglyLinkedList();

        myLinkedList.add_node(97, "a");
        myLinkedList.add_node(98, "b");
        myLinkedList.add_node(99, "c");

        myLinkedList.display_list();


    }
}
