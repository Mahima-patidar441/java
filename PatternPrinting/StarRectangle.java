package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int col = sc.nextInt();

        for(int i = 1 ; i <= row ; i++){ // kitni lines hogi
            for (int j = 1 ; j <= col ; j++){ // har lines se kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
