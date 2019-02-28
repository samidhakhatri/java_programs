//Program to check whether 2 strings are anagram of each other or not ignoring the case

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        int n1=a.length();
        int n2=b.length();

        if(n1!=n2){
            return false;
        }

        // converting the strings to there lowercase
        
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        // converting the strings to array so that we can sort
        char array1[]=a.toCharArray();
        char array2[]=b.toCharArray();
        
        java.util.Arrays.sort(array1);
        java.util.Arrays.sort(array2);

        // then again converting the sorted array to string to check the equality
        
        String str1=java.util.Arrays.toString(array1);
        String str2=java.util.Arrays.toString(array2);

        if(str1.equals(str2))
        return true;
        else 
        return false;

                    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}