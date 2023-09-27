package Arrays;
import  java.util.Arrays;
public class Mutable {
    public static void main(String[] args) {
        int[] ar = { 1,3,4,5};
        System.out.println(Arrays.toString(ar));
        change(ar);
        System.out.println(Arrays.toString(ar));
    }
    static void change(int[] arr){
        arr[0] = 99; // actual value will be changed
    }
}
