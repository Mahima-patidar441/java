package PatternPrinting;

import java.util.Scanner;

public class AlphaNumericTriangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows : ");
            int row = sc.nextInt();
            for (int i = 1 ; i <= row ; i++){
                char ch = 'A';
                for (int j = 1 ; j <= i ; j++){
                    if (i % 2 == 0) {
                        System.out.print(ch+" ");
                        ch++;
                    }
                    else{
                        System.out.print(j+" ");
                    }
                }
                System.out.println();
            }
        }
    }

