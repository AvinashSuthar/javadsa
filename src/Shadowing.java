package avinash;

public class Shadowing {
    static  int x = 100; // this will be shadowed at line 8;

    public static void main(String[] args) {
        System.out.println(x);
        int x ;
//        System.out.println(x); it will give error because scope begins when value is initialised
        x= 50;
        System.out.println(x); // 50 will be printed because of shadowing the lower scope is overriding the upper scope
        random();
    }

    static  void random(){
        System.out.println(x);
    }
}
