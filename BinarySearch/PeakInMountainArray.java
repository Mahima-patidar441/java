package BinarySearch;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,3,5,10,8,6,4,3};
        int low = 0 ;
        int high = arr.length-1 ;
        int peak = -1 ;
        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                peak = mid;
                break;
            }
            else if(arr[mid]<arr[mid+1]){
                low = mid + 1;
            }
            else{
                high = mid - 1 ;
            }
        }
        System.out.println("The peak element is at the index "+peak+" in the array : ");
        System.out.println("The peak element is : "+arr[peak]);
    }
}
