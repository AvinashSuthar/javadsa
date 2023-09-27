package avinash;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0] = 99; // if you make change to this object via this reference variable actual will be changed
    }

}
