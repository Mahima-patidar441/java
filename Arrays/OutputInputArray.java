package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // taking INPUT :
        System.out.print("Enter the Elements of the Array");
        for (int i = 0 ; i < n ; i++){
            int x = sc.nextInt();
            arr[i] = x;
        }

        // printing elements:
        System.out.print("The elements of the array are : ");
        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
