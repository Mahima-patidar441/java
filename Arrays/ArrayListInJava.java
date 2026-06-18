package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(30);
        arr.add(18);
        arr.add(26);

        System.out.println(arr.get(2)); // arr[2]
        arr.set(3,50); // arr[3] = 50
        System.out.println(arr);

        arr.add(78); // 25 30 18 26 78
        arr.add(1,100); // 25 100 30 18 26 78

        arr.remove(3);
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);

    }
}
