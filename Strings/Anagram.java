package Strings;

import java.util.Arrays;

public class Anagram {
    public static boolean areAnagram(String s1 ,String s2){
        if(s1.length()!=s2.length()) return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i = 0 ; i < c1.length ; i++){
            if(c1[i]!=c2[i]) {
                return false;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        boolean ans = areAnagram("listen","silent");
        if(ans){
            System.out.println("The strings are anagram");
        }
        else{
            System.out.println("The strings are not anagram");
        }

    }
}
