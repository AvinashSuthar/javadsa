import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        int[] arr2 = {3,5,2,1,4};
        cyclicSort2(arr);
        System.out.println(Arrays.toString(arr));
        cyclicSort2(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    static void cyclicSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[arr[i]-1]){
                swap(arr, i , arr[i]-1);
                i--;
            }
        }
    }
    static void cyclicSort2(int[] arr){
        int i = 0;
        while (i<arr.length){
            if (arr[i] != arr[arr[i]-1]){
                swap(arr , i , arr[i]-1);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
