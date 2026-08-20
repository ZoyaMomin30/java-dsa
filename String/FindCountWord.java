/* Input : Home, Sweet Home
           Home
 * Output : Number of that word present in the sentence : 2
 * 
 * Process
 * ----------
 * The word Home present in the sentence 2 times
 */

import java.util.*;

public class FindCountWord {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String find = sc.nextLine();
        int count = 0;
        //String ch = "";

        String[] arr = str.split("[^a-zA-Z]+");

        //1st method 
        for (String val : arr){
            if (val.equals(find) ){
                count++;
            }
        }
        System.out.println(count);

        //2nd method
        // for (int i = 0; i < arr.length; i++)
        // {
        //     for (int j = 0; j < arr[i].length(); j++) 
        //     {
        //         if(Character.isLetter(arr[i].charAt(j)))
        //         {
        //             ch = ch + arr[i].charAt(j);
        //         }
        //     }

        //     if(ch.equals(str))
        //     {
        //         count++;
        //     }
        //     ch = "";
        // }


        sc.close();
    } 
    
}
