package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n < 0) n = -n;
        int sum = 0;
        while(n != 0){
            int x = n % 10;
            n = n / 10;
            sum += x;
        }
        System.out.println(sum);
    }
}
