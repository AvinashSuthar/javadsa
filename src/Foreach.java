package Arrays;

import java.util.Scanner;

public class Foreach {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] array = { 1,3,4,5,6};
        for (int num: array
             ) {

            System.out.println(num);

        }
        Scanner sc = new Scanner(System.in);
        for (int num: arr
             ) {
            num = sc.nextInt();
        }
        for (int num: arr
        ) {
            System.out.println(num);
        }
    }
}
