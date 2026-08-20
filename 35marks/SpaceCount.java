/* Count number of spaces and characters in a string 
 * Input
 * ---------
 * Arijit is bad boy
 * 
 * Output
 * ------------------
 * Number of space : 3
   Number of character : 14
*/
import java.util.Scanner;

public class SpaceCount {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int space_count = 0;
        int letter_count = 0;
        char ch = ' ';

        for (int i = 0 ; i < str.length(); i++){
            if (Character.isLetter(str.charAt(i))){
                letter_count++;
            }
            if(str.charAt(i)== ch){
                space_count++;
            }
        }
        System.out.println(letter_count);
        System.out.println(space_count);
        sc.close();
    } 
}
