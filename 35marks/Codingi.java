/*
string input : Xplore
Character input : r
output : 4
*/

import java.util.Scanner;

public class Codingi{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char b = sc.next().charAt(0);
    
        for (int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}