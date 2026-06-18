package BinarySearch;

import java.util.Scanner;

public class LastOccurence {
        public static void main(String[] args) {
            int[] arr = {1,1,2,2,3,3,3,4,4,5,5,5,5,6};
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the target : ");
            int target = sc.nextInt();
            int low = 0 ;
            int high = arr.length-1;
            int idx = -1 ;
            while(low<=high){
                int mid = (low+high)/2;
                if(arr[mid] == target ){
                    idx = mid;
                    low = mid + 1 ;
                }
                else if(arr[mid] > target){
                    high = mid - 1 ;
                }
                else{
                    low = mid + 1;
                }
            }
            System.out.println("The index of last occurence is "+idx);
        }


}
