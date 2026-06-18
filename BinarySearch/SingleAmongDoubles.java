package BinarySearch;

public class SingleAmongDoubles {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,50,50,65,65};
        int low = 0 ;
        int high = arr.length-1;
        int single = 0 ;
        int n = arr.length;
        if(n == 1){
            single = arr[0];
        }
        if(arr[0]!=arr[1]){
            single = arr[0];
        }
        if(arr[n-1]!= arr[n-2]){
            single = arr[n-1];
        }

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                single = arr[mid];
                break;
            }
            int f = mid , s = mid ;
            if(arr[mid-1]==arr[mid]) {
                f = mid - 1;
            }
            else{
                s = mid+1;
            }
            int leftCount = f - low;
            int rightCount = high - s;
            if(leftCount%2==0) {
                low = s+1;
            }
            else{
                high = f - 1;
            }




        }
        System.out.println("The single element is : "+single);
    }
}
