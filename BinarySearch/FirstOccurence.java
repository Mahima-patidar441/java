package BinarySearch;

import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,4,4,5,5,5,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int low = 0 ;
        int high = arr.length-1;
        int idx = -1 ;
        while(low<=high){
            int mid = (low+high)/2;g
            if(arr[mid] == target ){
                idx = mid;
                high = mid - 1 ;
            }
            else if(arr[mid] > target){
                high = mid - 1 ;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println("The index of first occurence is "+idx);
    }
}
