import java.util.Arrays;

public class BubbleSortFor1DArray {
    public static void main(String[] args) {
//        int[]   arr = { 3,5,2,4,2,1,2,2,43,67,2,53,1};
        int[]   arr2 = {1,2,3,4,5,6,7,8};
//        bubbleSort(arr);
        bubbleSort(arr2);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
    static void bubbleSort(int[] ar){
        for (int i = 0; i < ar.length-1; i++) {
            boolean isSorted = true;
            for (int j = 1; j < ar.length-i ; j++) {
                if( ar[j] < ar[j-1]) {
                    int temp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = temp;
                    isSorted = false;
                }
                    System.out.println("it is sorting");
            }
            if (isSorted){
                System.out.println("sorted");
                return;
            }
        }
    }


}
