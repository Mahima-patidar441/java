package BinarySearch;

import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {-76,-54,-2,1,5,9,35,75,98};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int low = 0 ;
        int high = arr.length-1;
        boolean found = false ;
        int pos = -1 ;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target ){
                found = true ;
                pos = mid+1;
                break;
            }
            else if(arr[mid] > target){
                high = mid - 1 ;
            }
            else{
                low = mid + 1;
            }
        }
        if(found == true ) {
            System.out.println("The element found at "+pos+" position");
        }
        else{
            System.out.println("Element not found ");
        }
    }
}
