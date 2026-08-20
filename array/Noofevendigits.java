/*
Find the Number of even digits in a number. If it is greater than 2 then print true otherwise false

Input:
14236

Output:
TRUE

Input:
1459

Output:
FALSE
*/
// import java.util.*;

// public class Noofevendigits {
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count=0;
//         int rem = 0;
//         while(n>0){
//             rem = n%10;
//             if(rem%2 == 0){
//                 count++;
//             }
//             n = n%10;
//         }
//         if(count>2){
//             System.out.println("true");
//         }else{
//             System.out.println("false");
//         }

//         sc.close();
//     }
    
// }

import java.util.*;

public class Noofevendigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            int digit = n % 10; // extract last digit

            if (digit % 2 == 0) {
                count++;
            }

            n = n / 10; // remove last digit
        }

        if (count > 2) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        sc.close();
    }
}
