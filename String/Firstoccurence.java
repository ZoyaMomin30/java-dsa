/* 
print only first occurence of characters in a string 
input : experience
output : exprinc
*/

import java.util.Scanner;

public class Firstoccurence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // String str1 = "Zoya";
        // System.out.println(str1.indexOf("o"));
        // System.out.println(str1.charAt(2));
        String temp = "";

        //str pe traverse karke sabka indexOf check karengay in temp. agar woh letter temp mein already hai toh using indexOf it will return its index of temp. agar woh nahi hai present toh woh -1 return karega and then we can add it to temp.

        for (int i = 0; i < str.length(); i++){
            char current_char = str.charAt(i);
            if (temp.indexOf(current_char) == -1){
                temp = temp + str.charAt(i);
            }
        }
        System.out.println(temp);
        sc.close();
    }
}