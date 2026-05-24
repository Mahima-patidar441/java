package Loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term of GP : ");
        int a = sc.nextInt();
        System.out.println("Enter the common ratio of the GP : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of terns : ");
        int  n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            System.out.println(a);
            a*=r;
        }
    }
}
