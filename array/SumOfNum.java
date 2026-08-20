/* Input : 123Arijit1998Arijit10

 * Process :
 * -----------
 * Array : [123, Arijit, 1998, Arijit, 10]
 * Now you should sum up the position of that array where numbers are stored.
 * 123 + 1998 = 2131
 * 
 * Output :
 * --------------
 * 2131
 */

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String num="";
        int sum = 0;

        for(int i = 0; i < str.length() ; i++){
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                num += ch;
            }else{
                if( !num.isEmpty() ){
                    sum += Integer.parseInt(num) ;
                    num="";
                }
            }
        }
        if( !num.isEmpty() ){
            sum += Integer.parseInt(num) ;
            }

        System.out.println(sum);
        sc.close();
    }
    
}
