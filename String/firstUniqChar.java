/*
387. First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:

Input: s = "loveleetcode"

Output: 2

Example 3:

Input: s = "aabb"

Output: -1
*/
import java.util.*;

public class firstUniqChar {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //make an array count that will store the count of each letter. 
        int[] count = new int[26];

        //count frequency of each character 
        char[] characters = str.toCharArray();

        for(char ch : characters){
            System.out.println(ch);
        }

        
        for(char ch : characters){
            count[ch-'a']++;
            // System.out.println(ch);
        }

        //find the first character with frequency 1 
        for(int i = 0 ; i < str.length() ; i++){
            if(count[str.charAt(i)-'a'] == 1){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
    
}
    

