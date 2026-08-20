/*
word = silent 
Anagram because there can be other word made from it which is 
listen

input : 
silent 
listen

output : 
Anagram

Approach / Logic: Remove spaces, convert to lowercase, sort both strings and compare. Or use Counter/frequency map.

*/

import java.util.*;

public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        String str2= sc.nextLine();

        char[] a = str1.strip().toLowerCase().toCharArray();
        char[] b = str2.strip().toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a,b)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
        sc.close();
    }
}
