package Arrays;

import java.util.Scanner;
import java.util.Arrays;


public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        int[][] array = new int[2][]; // adding rows are mandatory not columns ;

        int[][] arrdon = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                arr[row][col] =  sc.nextInt();
            }
        }
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                System.out.print(arr[row][col]+ "   ");
            }
            System.out.println();
        }

        for (int[] a : arr
             ) {
            System.out.println(Arrays.toString(a));
        }
    }
}
