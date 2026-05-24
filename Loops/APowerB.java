package Loops;

import java.util.Scanner;

public class APowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int a = sc.nextInt();
        System.out.println("Enter the power");
        int b = sc.nextInt();
        int pow = 1;
        for(int i = 1 ; i <= b ; i++){
            pow *= a;
        }
        System.out.println(a + " raise to the power " +b+ "is : "+pow);

    }
}
