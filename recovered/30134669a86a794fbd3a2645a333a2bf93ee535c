/*
print all the vowels present at the 0 index of the words 
i/p = Hello I am a Student 
o/p = Iaa
*/

import java.util.Scanner;

public class Printvowel{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "Hello I am a Student";
        String words[] = str.split(" ");
        String Vowels = "aeiouAEIOU";

        for (int i = 0; i < words.length ; i++){
            //System.out.println(words[i]); //going through all individual words
            String Individual_word = words[i];
            char ch = Individual_word.charAt(0) ;
            if (Vowels.indexOf(ch) >= 0){
                System.out.print(ch);
            }
        }
        sc.close();
    }
}