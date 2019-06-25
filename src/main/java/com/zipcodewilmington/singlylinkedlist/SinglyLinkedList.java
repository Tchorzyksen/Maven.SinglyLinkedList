package com.zipcodewilmington.singlylinkedlist;

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {

    Node<E> first; // Reference to the first Node.

    private int size = 0;

    public SinglyLinkedList(){

    }

    /**
     * Links e as first element.
     */
    private void linkFirst(E e){
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(e, f);

        first = newNode;
        size++;
    }

    /**
     * Inserts the specified element at the beginning of this list.
     *
     * @param e the element to add
     */
    public void addFirst(E e){
        linkFirst(e);
    }

    /**
     * Returns the first element in this list.
     *
     * @return the first element in this list
     * @throws NoSuchElementException if this list is empty
     */
    public E getFirst(){
        final Node<E> f = first;
        if(f == null)
            throw new NoSuchElementException();

        return f.item;
    }

    /**
     * Returns the number of the elements in the list.
     *
     * @return the number of elements in the list.
     */
    public int getSize(){
        return size;
    }

    // Static nested class
    // Do not have access to other members of the enclosing class
    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E element, Node<E> next){
            this.item = element;
            this.next = next;
        }

    } // end generic Node declaration.

} // end SinglyLinkedList declaration.
