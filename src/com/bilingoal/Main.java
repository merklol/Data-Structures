package com.bilingoal;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtHead(10);
        linkedList.addAtTail(5);
        linkedList.addAtIndex(1,1);
        linkedList.deleteAtIndex(1);

        System.out.println("All elements: " + linkedList.toString());
        System.out.println("Linked list size: " + linkedList.size());
        System.out.println("Linked list element at index 1: " + linkedList.get(1));
    }
}
