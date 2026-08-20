/*
Find the Number of Lower case letters in a String

Input:
WelComeToMyJAva

Output:
The Number of Lowercase letters are:9

Explaination:
e,l,o,m,e,o,y,v,a are the Lowercase letters in the String

*/
import java.util.*;
public class Lowercase {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String ipsentence = sc.nextLine();
        String newsentence = ipsentence.replace(" ", "");

        //logic 
        //1. strip of whitespaces 
        //2. convert the string to array
        //2. use isUpperCase() function

        char[] arr = newsentence.toCharArray();
        int count=0;

        for (int i = 0; i < newsentence.length(); i++){
            if (Character.isLowerCase(arr[i])){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
