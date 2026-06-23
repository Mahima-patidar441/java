package Strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.next();
        int i = 0 ;
        int j = s.length()-1;
        boolean flag = true ;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                flag = false ;
                break;
            }
            i++;
            j--;
        }
        if(flag == true) System.out.println("String is palindrome");
        else System.out.println("String is not palindrome");
    }
}
