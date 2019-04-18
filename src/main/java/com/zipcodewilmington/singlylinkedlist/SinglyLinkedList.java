package com.zipcodewilmington.singlylinkedlist;

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

    public SinglyLinkedList(Node head) { // Initialise list with already existing one.
        this.head = head; // Shallow Copy
    }

    public SinglyLinkedList(){
        this(null);
    }

    public boolean add_node(int id, String name){
        // Push front.
        Node new_node = new Node(id, name); // Create new element.

        new_node.setNext_node(this.head); // Set next element to head.
        this.head=new_node; // Set head to new element.

        return this.head.getId()==id;
    }

    public void display_list(){

        Node traverse =this.head; // Preserve head. Create copy of head to traverse list.

        while(traverse!=null){

            System.out.println("Id: " + traverse.getId()
                    + "\tName: " + traverse.getName() + "\r");

            traverse=traverse.next_node;
        }

    }

} // end SinglyLinkedList declaration.
