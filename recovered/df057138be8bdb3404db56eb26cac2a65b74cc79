/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
import java.util.*;
public class CountPrime {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        //logic :
        //1. convert into int and then check if it is prime.
        
        for (int i = 0; i < str.length() ; i ++){

            int n = Integer.valueOf(String.valueOf(str.charAt(i)));

            if (isPrime(n) == true ){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    } 

    public static boolean isPrime(int num){
         // Numbers less than or equal to 1 are not prime
        if (num <= 1){
            return false;
        }

        // Check for divisors from 2 up to the square root of n
        for (int i = 2; i < Math.sqrt(num) ; i++){
            if (num % i == 0 ){
                return false;
            }
        }
        return true;
        }
}