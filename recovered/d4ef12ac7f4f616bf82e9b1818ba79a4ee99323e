/*
 * You are given a string S consisting of lowercase letters. Your task is to remove all the consecutive duplicates from
 * the string and output the result. For example, if the input string is "abbcddeff", the output should be "abcdef".
 * 
 * Input: abbcddeff
 * Output: abcdef
 */

import java.util.*;

public class Remove2consecutiveletters{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //logic
        //1. print the first character 
        //2. compare the characters from index 1 to its previous characters
        //// Compare each character with the previous one
        /// if they are not equal then only print. 


        System.err.print(str.charAt(0));

        for(int i = 1; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(i-1)){
                System.out.print(str.charAt(i));
            }
        }

        sc.close();
    }
}

