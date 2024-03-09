package com.LinkedList;

public class CircularLL {
    private Node head;
    private Node tail;
    public CircularLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        node.next = head;

    }
    public void delete(int val){
        Node node = head;
        if (head == null){
            System.out.println("LL is empty");
            return;
        }
        if (node.value == val ){
            head = node.next;
            tail.next  = head;
        }
        do {
            Node n = node.next;
            if (n.value == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);

    }
    public void display(){
        Node node = head;
        do {
            System.out.print(node.value + " -> ");
            node = node.next;
        }while (node != head);
        System.out.println(" Head ");
    }

    private class Node{
        int value;
        Node next;


        public Node(int value) {
            this.value = value;
        }


    }
}
