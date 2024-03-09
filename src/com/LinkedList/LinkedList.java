package com.LinkedList;



public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){
        this.size = 0;
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp  = temp.next;

        }
        System.out.println("    end");
    }

    public void insertFirst(int value){
        Node n = new Node(value);
        n.next = head;
        head = n;
        if (tail == null){
            tail =head;
        }
        size += 1;

    }
    public void insertLast(int value){
        if (tail == null){
            insertFirst(value);
        }
        else {
            Node n = new Node(value);

            tail.next = n;
            tail = n;
            size += 1;
        }
    }
    public void insert(int value , int index){
        if (index==0){
            insertFirst(value);
            return;
        }
        if (index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node n = new Node(value, temp.next);
        temp.next= n;
        size += 1;

    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }
    private Node getNode(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public Node find(int value){

        Node temp = head;
        while (temp != null){
            if (temp.value == value){
                return temp;
            }
            temp = temp.next;
        }


        return null;
    }
    public int delete(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node pre = getNode(index-1);
        int val = pre.next.value;
        pre.next = pre.next.next;
        size--;
        return val;
    }

    public int deleteLast(){
        Node n = getNode(size-2);

        tail =n;
        int val = n.next.value;
        n.next  = null;
        size--;
        return val;
    }

    private class Node{
        private Node next;
        private int value;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next =next;
        }
    }
}
