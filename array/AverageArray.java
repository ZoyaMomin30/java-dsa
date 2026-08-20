/* Find average of a number array between two limit numbers (except the two numbers)
 * Input
 * ---------------
 * // 5
    1 
    2
    3
    4
    5
 *  1
 *  4
 * 
 * Output
 * ---------------
 * 2
 */
import java.util.*;
public class AverageArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        int sum = 0 ;
        int count = 0;
        int ans = 0;
        int lower = sc.nextInt(); sc.nextLine();
        int upper = sc.nextInt(); sc.nextLine();

        //1st method
        // for (int i = 0 ; i < n ; i ++){
        //     if (arr[i] > lower && arr[i] < upper){
        //         sum += arr[i];
        //         count++; 
        //     }
        // }

        //2nd method
        int lowerIndex = index(arr,lower);
        int upperIndex = index(arr,upper);

        if (upperIndex > 0 && lowerIndex+1 < upperIndex){
            for (int i = lowerIndex+1 ; i < upperIndex; i++){
                sum += arr[i];
                count++;
            }
        }
        ans = sum/count;

        System.out.println(ans);
        sc.close();
    }

    public static int index(int[] arr, int n){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == n){
                return i;
            }
        }
        return 0;
    }
}
