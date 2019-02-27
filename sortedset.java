//Program to find the lexicographically smallest and largest substrings of length k


import java.util.Scanner;

public class Solution {

public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        java.util.SortedSet <String> sets=new java.util.TreeSet<String>();

        for(int i=0;i<=s.length()-k;i++){
            sets.add(s.substring(i,i+k));
        }

        smallest=sets.first();
        largest=sets.last();
        
      
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}