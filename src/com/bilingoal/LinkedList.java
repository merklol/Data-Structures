package com.bilingoal;

public class LinkedList {
    private int size = 0;
    private Node head;

    public LinkedList() { }

    public int get(int index) {
        Node current = head;
        int i = 0;
        while (current != null)
        {
            if(i == index) return current.data;
            current = current.next;
            i++;
        }

        return -1;
    }

    public void addAtHead(int val) {
        size++;
        if(isEmpty()) {
            head = new Node(val);
            return;
        }

        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void addAtTail(int val) {
        size++;

        if(isEmpty()) {
            head = new Node(val);
            return;
        }

        Node current = head;
        while(current.next != null) {
            current = current.next;
        }

        current.next = new Node(val);
    }

    public void addAtIndex(int index, int val) {
        size++;
        Node node = new Node(val);
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            while (--index > 0) current = current.next;
            node.next = current.next;
            current.next = node;
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null) return;
        Node temp = head;

        if (index == 0)
        {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < index - 1; i++) temp = temp.next;

        if (temp == null || temp.next == null) return;

        temp.next = temp.next.next;
        size--;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        Node current = head;
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");
        while (current != null) {
            stringBuilder.append(current.data).append(" ");
            current = current.next;
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    private boolean isEmpty() {
        return head == null;
    }

    private static class Node {
        protected Node next;
        protected int data;

        public Node(int data) {
            this.data = data;
        }
    }
}

