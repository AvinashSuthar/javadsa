import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1); // integer will be converted to integer that will call toString();

        System.out.println("Avinash" + new ArrayList<>());
        System.out.println("Avinash" + new Integer(56));
//        System.out.println( new Integer(56) + new ArrayList<>() ); error atleast one should be string
         
    }
}
