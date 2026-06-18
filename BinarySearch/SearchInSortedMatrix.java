package BinarySearch;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = { {1,5,9},{14,20,21},{30,34,43}};
        int target = 14;
        int rows = arr.length;
        int cols = arr[0].length;
        int low = 0 ;
        int high = rows*cols-1;
        boolean found = false ;
        while(low<=high) {
            int mid = low + (high-low)/2;
            int midRow = mid/cols;
            int midCol = mid%cols;
            if(arr[midRow][midCol] == target){
                found = true;
                break;
            }
            else if(arr[midRow][midCol] > target) high = mid - 1;
            else low = mid+1 ;
        }
        if(found==true){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found ");
        }
    }
}
