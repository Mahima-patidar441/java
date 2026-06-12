package Arrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = { 10,20,30,40,50,60,70};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched in array : ");
        int key = sc.nextInt();
        int f = 0;
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i]==key){
                f = 1;
                break;
            }
        }
        if (f == 1){
            System.out.println("The element found ");
        }
        else{
            System.out.println("The element not found");
        }
    }
}
