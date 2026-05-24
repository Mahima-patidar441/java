package Loops;

import java.util.Scanner;

//check for Composite Numbers
public class CheckCompositeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int f = 0;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n%i==0){
                f = 1;
                break;
            }
        }
        if (f == 1) {
            System.out.println("The number is composite ");
        }
        else{
            System.out.println("The number is prime ");
        }
    }
}
