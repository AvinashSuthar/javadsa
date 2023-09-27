package avinash;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println();
        don(1,2,4,6,7,8,4,6,3);
        don("avinash", "rahul","Don");
    }
    static void don(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void don(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
