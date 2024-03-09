package com.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList l = new LinkedList();
//        l.insertFirst(12);
//        l.insertFirst(2);
//        l.insertLast(13);
//        l.insertFirst(1);
//        l.insert(1212, 4);
//        l.display();
//        System.out.println(l.find(2));
//        System.out.println(l.deleteFirst());
//        l.display();
//        System.out.println(l.deleteLast());
//        l.display();
//        System.out.println(l.delete(2));
//        l.display();
        CircularLL cl = new CircularLL();
        cl.insert(12);
        cl.insert(1);
        cl.insert(54);
        cl.insert(3);
        cl.display();
        cl.delete(54);
        cl.display();
    }
}
