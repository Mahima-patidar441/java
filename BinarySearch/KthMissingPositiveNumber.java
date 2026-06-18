package BinarySearch;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {3,5,9,10,11,12};
        int k = 2;
        int low = 0 ;
        int high = arr.length-1;
        while(low<= high){
            int mid = low+(high-low)/2;
            int correct_no = mid+1;
            int missing = arr[mid] - correct_no;
            if(missing >= k){
                high = mid - 1 ;
            }
            else{
                low = mid + 1 ;
            }
        }
        System.out.println("The Kth missing number is : "+(high+1+k));
    }
}
