package Sorting;

import java.util.Arrays;

public class TwoSumPair {
    public static void main(String[] args) {
        int[] arr = {2,5,3,8,6,8,1,4};
        int target = 9 ;
        Arrays.sort(arr);
        int i = 0 ;
        int j = arr.length-1;
        while(i<j){
            if (arr[i] + arr[j] == target){
                break;
            }
            else if(arr[i] + arr[j] > target ){
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("The target sum can be obtained by "+arr[i]+" and "+arr[j]);
    }
}
