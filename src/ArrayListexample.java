package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListexample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list2 = new ArrayList<>();


        list.add(45);
        list.add(455);
        list.add(4556);
        list.add(45678);

        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list2.add(sc.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list2.get(i));
        }

        /*
        *
        *   list.remove(2);
        * list.set(2,45);
        *
        *
        *
        *
        *
        * */
    }
}
