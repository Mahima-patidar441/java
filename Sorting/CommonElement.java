package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int[] arr1 = {3,4,2,2,4};
        int[] arr2 = {3,2,2,7};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0 , j = 0 ;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(list);
    }
}
