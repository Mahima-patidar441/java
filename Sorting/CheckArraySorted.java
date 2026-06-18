package Sorting;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10};
        boolean flag = true ;
        for (int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i]>arr[i+1]){
                flag = false ;
                break;
            }
        }
        if (flag == false) {
            System.out.println("The array is not sorted ");
        }
        else{
            System.out.println("The array is sorted ");
        }
    }
}
