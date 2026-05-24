import java.util.Scanner;

public class  arithmeticOperators
{
    public static void main(String[] args) {
        int p, q  ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number :  ");
        p = sc.nextInt();
        System.out.println("Enter the second number : ");
        q = sc.nextInt();

        System.out.println("the addition of the given numbers : " +(p+q));
        System.out.println("the subtraction of the given numbers : "+(p-q));
        System.out.println("the multiplication of the given numbers : "+(p*q));
        System.out.println("the division of given numbers : " +(p/q));
    }
}