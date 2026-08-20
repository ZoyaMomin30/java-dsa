/*
print the last occurence of a sentence igore whitespaces and numbers 
input : hey3 Java Learners
output : as
*/

import java.util.Scanner;
import java.lang.Character;

public class Lastchar{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String Sentence = "this3 is4 java";

        /*
        Logic : 
        1. split the sentences using " "
        2. print l-1 character
        3. compare if it is number or not. 
        */

       String words[] = Sentence.split(" ");
       
       for (int i = 0; i < words.length ; i++){
        String indi_word = words[i];
        char ch = indi_word.charAt(indi_word.length()-1);

        if(Character.isDigit(ch)){
            continue;
        }
        System.out.print(ch);
        
       }
       sc.close();
    }
}