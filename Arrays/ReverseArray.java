package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 5,8,2,1,6,4,10};
        int n = arr.length;
        int i = 0 ;
        int j = n-1;
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++;
            j--;
        }
        System.out.println("After reversing the array : ");
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
