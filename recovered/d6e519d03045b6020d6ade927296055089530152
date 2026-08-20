/*
Print the largest word in a sentence 
input : "welcome this is java learning"
output : 
*/

import java.util.Scanner;

public class Largestword{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "welcome this is java learning";
        int max = 0;

        /*
        logic :
        1. store each word in array 
        2. compare the length of each word 
        3. store the maximum length in temp var
        4. display word[temp]
        */

       String[] words = str.split(" ");
       String max_length_word = "";

       for (int i = 0; i < words.length ; i++){
        String indi_word = words[i];

        if (indi_word.length() > max ){
            max = indi_word.length();
            max_length_word = indi_word;
        }
       }
       System.out.println(max_length_word);

       sc.close();

    }
}