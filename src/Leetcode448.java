import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Leetcode448 {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list5 = new ArrayList<>();
        cyclicSort2(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != i+1){
                list5.add(i+1);
            }
        }
        return list5;
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