package Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int Rev = 0 ;
        while (n != 0){
            int x = n%10;
            Rev = (Rev*10) + x;
            n = n/10;
        }
        System.out.println(Rev);
    }
}
