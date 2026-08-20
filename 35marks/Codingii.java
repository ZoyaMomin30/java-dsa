/* 
Count the number of small case letters
Input : Zoya
Output : 3
*/

import java.util.Scanner;
import java.lang.Character;

public class Codingii{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        for (int i = 0 ; i <str.length(); i++){
            if (Character.isLowerCase(str.charAt(i))){
                count = count +1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}