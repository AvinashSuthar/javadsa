import java.util.Arrays;

public class Leetcode645 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] nums) {
        cyclicSort2(nums);
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans[1] = i+1;
                ans[0] = nums[i];
            }

        }
        return ans;
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
