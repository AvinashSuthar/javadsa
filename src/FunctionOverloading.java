package avinash;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(65);
        fun("Avinash");
    }
    static  void fun(int a){
        // ambiguity : can't empty when var args are overloaded;

    }
    static  void fun(String a){

    }


}
