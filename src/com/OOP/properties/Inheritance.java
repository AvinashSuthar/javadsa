package com.OOP.properties;

 class Box{
    int w ;
    int h;
    int l;

    Box(int w, int h, int l) {
        this.w = w;
        this.h = h;
        this.l = l;
    }
    Box(int side) {
        this.w = side;
        this.h = side;
        this.l = side;
    }

    Box(){
        this.w = -1;
        this.l = -1;
        this.h = -1;
    }
}
class InheritingBox extends Box{
    int weight;

    InheritingBox(int w ,int l , int h , int weight ){
        super(w, l , h);
        this.weight = weight;
    }
}
public class Inheritance {
//    public static void main(String[] args) {
//        InheritingBox ib  = new InheritingBox();
//        System.out.println(ib.h = 10);
//        System.out.println(ib);
//    }
}
