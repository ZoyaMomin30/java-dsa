/*
Reverse the num 
i/p : 12345
o/p : 54321
*/

import java.util.*;
public class ReverseNum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        String string_n = Integer.toString(n);
        for (int i = string_n.length()-1 ; i >=0  ; i--){
            System.out.print(string_n.charAt(i));
        }

        for (int i = 0; i < n; i++){
            System.out.println(i);
        }
        sc.close();
    }
    
}
