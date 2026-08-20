import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int n = 0;
        double sum = 0;
        int count = 0; 
        int temp = num ;

        while (temp > 0){
            n = num %10 ;
            count = count + 1;
            temp = temp /10;
        }

        temp = num;
        while (temp > 0){
            n = temp %10;
            sum = sum + Math.pow(n,count);
            temp = temp /10;
        }

        if(sum == num){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
    
}
