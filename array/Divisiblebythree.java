/*
Input:
a=12,b=100


Output:
Sum=810
Count=15
given a range first find out how many numbers are divisible by three. then out that find how many are divisble by 2. then give the sum and count. 
*/
import java.util.Scanner;

public class Divisiblebythree {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); sc.nextLine();
        int b = sc.nextInt();
        int count=0;
        int sum=0;

        for (int i = a; i <b; i++){
            if(i%3 == 0){
                if (i%2 == 0){
                    count++;
                    sum = sum+i;
                }
            }
        }
        sc.close();
        System.out.println(sum);
        System.out.println(count);
    }
}
