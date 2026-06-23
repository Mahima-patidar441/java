package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static char maxOccuringChar(String s1){
        // SOLUTION 1 :
//        int n = s1.length();
//        int maxFreq = -1 ;
//        char ans = s1.charAt(0);
//        for (int i = 0 ; i < n ; i++){
//            int freq = 1;
//            char ch = s1.charAt(i);
//            for (int j = i+1 ; j<n ; j++) {
//                if (s1.charAt(j) == ch) freq++;
//            }
//            if(freq>maxFreq){
//                maxFreq = freq;
//                ans = ch ;
//            }
//            else if(freq == maxFreq && ch < ans){
//                ans = ch ;
//            }
//        }
//        return ans;

        // SOLUTION 2:
//        int n = s1.length();
//        int maxFreq = -1 ;
//        char ans = s1.charAt(0);
//        char[] arr = s1.toCharArray();
//        Arrays.sort(arr);
//        int i = 0 , j = 0 ;
//        while(j<n){
//            if (arr[i] ==arr[j]){
//                j++;
//            }
//            else{
//                int freq = j-i;
//                if(freq > maxFreq){
//                    maxFreq = freq;
//                    ans = arr[i];
//                }
//                i = j;
//            }
//        }
//        int freq = j-i;
//        if(freq > maxFreq) {
//            maxFreq = freq;
//            ans = arr[i];
//        }
//        return ans ;

        // SOLUTION 3:

        int n = s1.length();
        int[] freq = new int[26];
        for(int i = 0 ; i < n ; i++){
            char ch = s1.charAt(i);
            int idx = ch-97;
            freq[idx]++;
        }
        int maxFreq = 0 ;
        char ans = s1.charAt(0);
        for (int i = 0 ; i < 26 ; i++){
            if(freq[i] >maxFreq){
                maxFreq = freq[i];
                ans = (char)(i+97);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1 = sc.next();
        char ch = maxOccuringChar(s1);
        System.out.println("Max occuring character is : "+ch);
    }
}
