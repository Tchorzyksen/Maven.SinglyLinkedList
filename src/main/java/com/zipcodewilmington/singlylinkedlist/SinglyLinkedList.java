package com.zipcodewilmington.singlylinkedlist;

import java.util.NoSuchElementException;

public class SinglyLinkedList {

    private class Node { // Inner class node declaration.

        private int id;

        private String name;

        private Node next_node; // Next element ref.

        public Node(int id, String name) { // Constructor.
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Node getNext_node() {
            return next_node;
        }

        public void setNext_node(Node next_node) {
            this.next_node = next_node;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

    } // end Node declaration.

    private Node head; // First element ref.

    private Node tail; // Last element ref.

    private int element_count; // Store number of elements.

    private SinglyLinkedList(Node head, Node tail, int element_count) {
        this.head = head;
        this.tail = tail;
        this.element_count = element_count;
    }

    public SinglyLinkedList(SinglyLinkedList singlyLinkedList) { // Initialise list with already existing one.
        this.head = singlyLinkedList.getHead(); // Shallow Copy
        this.tail = singlyLinkedList.getTail();
        this.element_count = singlyLinkedList.size();
    }

    public SinglyLinkedList(){
        this(null, null, 0);
    }

    private Node getHead() {
        if (this.head == null)
            throw new NoSuchElementException();

        return this.head;
    }

    private Node getTail() {
        return tail;
    }

    public int size() {
        return element_count;
    }

    public void push_front(int id, String name){
        // Push front.
        Node new_node = new Node(id, name); // Create new element.

        if(this.head==null) // Only one element inside list results in head and tail to point at the same node.
            this.tail=new_node;
        else
            new_node.setNext_node(this.head); // Set next element to head.

        this.head=new_node; // Set head to new element.

        element_count++;
    }

    public void push_back(int id, String name){

        Node new_node = new Node(id, name);

        if(this.head==null) // list empty add new element as head.
            this.head = new_node;
        else
            this.tail.setNext_node(new_node);

        this.tail = new_node;

        element_count++;
    }

    public int find(int id){

        int index=0;
        for(Node traverse = this.head; traverse!=null; traverse=traverse.getNext_node()){

            if(traverse.getId()==id)
                return index;

            index++;
        }

        return -1; // Failed to find element with given index.
    }

    public void display_list(){

        Node traverse =this.head; // Preserve head. Create copy of head to traverse list.

        int index=0;
        while(traverse!=null){

            System.out.println("Index: " + (index++) + "\t\tId: " + traverse.getId()
                    + "\t\tName: " + traverse.getName() + "\r");

            traverse=traverse.next_node;
        }

    }

} // end SinglyLinkedList declaration.
