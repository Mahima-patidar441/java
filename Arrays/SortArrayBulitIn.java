package Arrays;
import java.util.Arrays;
public class SortArrayBulitIn {
    public static void main(String[] args) {
        int[] arr = { 4,-7,3,2,8,9,1};
        System.out.println("The unsorted Array is : ");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("The sorted Array is : ");

        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
