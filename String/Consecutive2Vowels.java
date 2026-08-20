/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "eating" and "meatballs".
 */

import java.util.Scanner;
public class Consecutive2Vowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        String vowels = "aeiouAEIOU";
        String[] words = str.split(" ");
        int count = 0;
        
        for (String val : words){
            for (int i = 1;i < val.length(); i ++){
                
                if (vowels.indexOf(val.charAt(i-1)) > -1 && vowels.indexOf(val.charAt(i)) > -1){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        sc.close();
    } 
}