/*
Create class Inventory with below attributes:

inventoryId - String
maximumQuantity - int
currentQuantity - int
threshold - int

Create class Solution and implement static method "Replenish" in the Solution class.
This method will take array of Inventory objects and a limit int as parameters.
And will return another array of Inventory objects where the limit int is greater than or equal to the original array of Inventory object's threshold attribute.

Write necessary getters and setters.

Before calling "Replenish" method in the main method, read values for four Inventory objects referring the attributes in above sequence along with a int limit.Then call the "Replenish" method and write logic in main method to print "Critical Filling", if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print 
"Moderate Filling". Else print "Non-Critical Filling"

input
---------------------------
1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45

Output
----------------------------
2 Non-Critical Filling
3 Non-Critical Filling
4 Non-Critical Filling
*/
import java.util.*;

class Inventory {
    String inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    public String getInventoryId(){
        return inventoryId;
    }

    public int getMaximumQuantity(){
        return maximumQuantity;
    }

    public int getCurrentQuantity(){
        return currentQuantity;
    }

    public int getThreshold(){
        return threshold;
    }

    //constructor
    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold){
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

}
public class Solutionfour {
    public static void main (String[] args){
        Inventory[] arr = new Inventory[4];
        Scanner sc = new Scanner(System.in);

        //take input
        for (int i = 0; i < 4; i ++){
            String inventoryId = sc.nextLine();
            int maximumQuantity = sc.nextInt(); sc.nextLine();
            int currentQuantity= sc.nextInt(); sc.nextLine();
            int threshold = sc.nextInt(); sc.nextLine();
        
            //store in array 
            arr[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
        }

        int limit = sc.nextInt();

        Inventory[] result = replenish(arr, limit);

        for (int i = 0; i< result.length; i++){
            if (result[i].getThreshold() > 75){
                System.out.println(result[i].getInventoryId() + " Critical Filling");
            }else if(result[i].getThreshold() >= 50 && result[i].getThreshold() <= 75){
                System.out.println(result[i].getInventoryId() + " Moderate Filling");
            }else{
                System.out.println(result[i].getInventoryId() + " Non-critical Filling");

            }
        }

        sc.close();

    }

    /*
    public static Inventory[] Replenish(Inventory[] arr, int limit) {

    int count = 0;

    // Count matching objects
    for(int i = 0; i < arr.length; i++) {
        if(limit >= arr[i].getThreshold()) {
            count++;
        }
    }

    Inventory[] result = new Inventory[count];

    int index = 0;

    // Store matching objects
    for(int i = 0; i < arr.length; i++) {
        if(limit >= arr[i].getThreshold()) {
            result[index] = arr[i];
            index++;
        }
    }

    return result;
}
    */

    public static Inventory[] replenish(Inventory[] arr, int limit){
        Inventory[] result = new Inventory[0];
        for(int i = 0; i<4 ; i++){
            if (limit >= arr[i].getThreshold()){
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = arr[i];
            }
        }
        return result;
    }
}
