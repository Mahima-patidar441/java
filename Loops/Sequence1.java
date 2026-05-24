package Loops;

import java.util.Scanner;
// print  1 n 2 n-1 3 n-2 4 n-3 ..........
public class Sequence1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        for(int i = 1 ; n > 0 ; i++){
            System.out.println(i);
            System.out.println(n);
            n = n-1;
        }

    }
}
