package avinash;

public class Swap {
    public static void main(String[] args) {
        int a= 10;
        int b = 20;
        System.out.println("this is a " + a + " this is b " + b);
        swap(a ,b);
        System.out.println("this is a " + a + " this is b " + b);
    }
    static void swap(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("this is a " + a + " this is b " + b);
    }
}
