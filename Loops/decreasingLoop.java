package Loops;

import java.util.Scanner;

public class decreasingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i = n ; i > 0 ; i--){
            System.out.println(i);
        }
    }
}
