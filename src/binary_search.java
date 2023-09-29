import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
//        int[] arr = new int[10];
////        for (int i = 0; i < 10; i++) {
////            arr[i] = sc.nextInt();
////
////        }
        int[] dsArr = {23,19,15,13, 9 ,7,4,3,2};
        int[] asArr = {1,2,3,5,6,7,8,66,434};

        System.out.println(dsBinarySearch(15,dsArr));
        System.out.println(asBinarySearch(5, asArr));
        checkOrder(15,dsArr);
        checkOrder(5,asArr);
    }

    static void checkOrder(int target ,int[] arr){
        if (arr[0]>arr[arr.length-1]){
            System.out.println(dsBinarySearch(target , arr));
        }
        else {
            System.out.println(asBinarySearch(target, arr));
        }
    }

    static int dsBinarySearch(int target, int[] arr){


            int s = 0;
            int e = arr.length-1;

            while (s<=e){
                int m = s + (e-s)/2;
                if (target<arr[m]){
                    s = m+1;
                } else if (target>arr[m]) {
                    e = m-1;
                } else {
                    return m;
                }

            }

        return -1;

    }
    static int asBinarySearch(int target, int[] arr){


        int s = 0;
        int e = arr.length-1;

        while (s<=e){
            int m = s + (e-s)/2;
            if (target<arr[m]){
                e = m-1;
            } else if (target>arr[m]) {
                s = m+1;
            } else {
                return m;
            }

        }

        return -1;

    }
}
