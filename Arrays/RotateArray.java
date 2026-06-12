package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10,11,12,13};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the d : ");
        int d = sc.nextInt();
        d = d % n;
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println("After Rotating the Array : ");
        for(int ele: arr){
            System.out.print(ele+" ");
        }

    }
    public static void reverse(int[] arr , int i , int j ){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++;
            j--;
        }
    }

}
