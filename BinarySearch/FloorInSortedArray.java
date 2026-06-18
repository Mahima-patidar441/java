package BinarySearch;

import java.util.Scanner;

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1,2,8,10,10,25,34};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Target : ");
        int target = sc.nextInt();
        int low = 0 ;
        int high = arr.length-1;
        int idx = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                high = mid -1 ;
            }
            else {
                idx = mid;
                low = mid+1;
            }
        }
        System.out.println("The floor value of the target is : "+arr[idx]);
    }
}
