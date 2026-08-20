/*
Vehicle Management System

Create a class Vehicle with the following attributes:

vehicleId - int
vehicleName - String
manufacturer - String
price - double

The above attributes should be private. Write getters, setters, and a parameterized constructor.

Create a class ElectricVehicle that inherits from Vehicle with the following additional attributes:

batteryCapacity - int (in kWh)
chargingTime - double (in hours)
range - int (in kilometers)

The above attributes should be private. Write getters, setters, and a parameterized constructor.

Create a class Solution with the main() method.

Implement the following two static methods in the Solution class.

Method 1
public static ElectricVehicle[] findElectricVehiclesByRange(ElectricVehicle[] arr, int minimumRange)

Description
This method takes an array of ElectricVehicle objects and an integer representing the minimum driving range.
It should return an array of all ElectricVehicle objects whose range is greater than or equal to the given minimum range.
The returned array should be sorted in ascending order of chargingTime.
If no vehicle satisfies the condition, the method should return null.

Method 2
public static ElectricVehicle findSecondCostliestVehicle(ElectricVehicle[] arr)

Description

This method takes an array of ElectricVehicle objects.
It should return the ElectricVehicle object having the second highest price.
No two vehicles will have the same price.
If the array contains fewer than two vehicles, the method should return null.

Note
All searches should be case-sensitive.
No two ElectricVehicle objects will have the same vehicleId.
No two ElectricVehicle objects will have the same price.
Use inheritance properly.
Do not use predefined sorting methods such as Arrays.sort().
Input Format

The first input represents the number of ElectricVehicle objects.

For each ElectricVehicle, read the values in the following order:

vehicleId
vehicleName
manufacturer
price
batteryCapacity
chargingTime
range

Finally read the integer representing the minimum range.

Output Format

For findElectricVehiclesByRange

If the returned array is not null, print

vehicleId
vehicleName
chargingTime

for every object in the returned array.

Otherwise print

No Vehicle Found

For findSecondCostliestVehicle

If the returned object is not null, print

vehicleId
vehicleName
price

Otherwise print

Not Enough Vehicles
Sample Input
4
101
Nexon EV
Tata
1600000
40
8.5
312
102
ZS EV
MG
2300000
50
9.0
419
103
Comet EV
MG
900000
18
6.5
230
104
Ioniq 5
Hyundai
4600000
72
7.0
631
300

Sample Output
104
Ioniq 5
7.0
101
Nexon EV
8.5
102
ZS EV
9.0

102
ZS EV
2300000.0
Sample Input 2
1
101
Comet EV
MG
900000
18
6.5
230
300
Sample Output 2
No Vehicle Found
Not Enough Vehicles
*/
import java.util.*;

class Vehicle{
    private int vehicleId;
    private String vehicleName;
    private String manufacturer;
    private double price;

    public Vehicle(int vehicleId,  String vehicleName, String manufacturer, double price){
        this.vehicleId=vehicleId;
        this.vehicleName=vehicleName;
        this.manufacturer=manufacturer;
        this.price=price;
    }

    public int getVehicleId(){
        return vehicleId;
    }

    public String getVehicleName(){
        return vehicleName;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public double getPrice(){
        return price;
    }


}

class ElectricVehicle extends Vehicle{
    private int batteryCapacity;
    private double chargingTime;
    private int range;

    public ElectricVehicle(int vehicleId,  String vehicleName, String manufacturer, double price, int batteryCapacity, double chargingTime, int range){
        
        super(vehicleId, vehicleName, manufacturer, price);

        this.batteryCapacity=batteryCapacity;
        this.chargingTime=chargingTime;
        this.range=range;
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public double getChargingTime(){
        return chargingTime;
    }
    public int getRange(){
        return range;
    }

}
public class VehicleSoln {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();

        ElectricVehicle[] arr = new ElectricVehicle[n];
        for (int i = 0; i < n ; i++){
            int id = sc.nextInt(); sc.nextLine();
            String name= sc.nextLine();
            String manufacturer= sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            int capacity = sc.nextInt(); sc.nextLine();
            double time = sc.nextDouble();sc.nextLine();
            int range = sc.nextInt();sc.nextLine();

            arr[i] = new ElectricVehicle(id, name, manufacturer, price, capacity, time, range);
        }

        int minrange = sc.nextInt(); sc.nextLine();

        ElectricVehicle[] ans = findElectricVehiclesByRange(arr,minrange);
        if (ans == null){
            System.out.println("No Vehicle Found");
        }else{
            for ( ElectricVehicle e : ans){
                System.out.println(e.getVehicleId());
                System.out.println(e.getVehicleName());
                System.out.println(e.getManufacturer());
                System.out.println(e.getChargingTime());
            }
        }

        ElectricVehicle result2 = findSecondCostliestVehicle(arr);
        if (result2 == null) {

            System.out.println("Not Enough Vehicles");

        } else {

            System.out.println(result2.getVehicleId());
            System.out.println(result2.getVehicleName());
            System.out.println(result2.getPrice());
        }
        
        sc.close();
    }
    /*
    public static ElectricVehicle[] findElectricVehiclesByRange(ElectricVehicle[] arr, int minimumRange)

Description
This method takes an array of ElectricVehicle objects and an integer representing the minimum driving range.
It should return an array of all ElectricVehicle objects whose range is greater than or equal to the given minimum range.
The returned array should be sorted in ascending order of chargingTime.
If no vehicle satisfies the condition, the method should return null.
    */

    public static ElectricVehicle[] findElectricVehiclesByRange(ElectricVehicle[] arr, int minrange){
        ElectricVehicle[] ans = new ElectricVehicle[0];
        for (ElectricVehicle e : arr){
            if (e.getRange() >= minrange){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = e;
            }
        }

        //ascending order of charging time 
        ElectricVehicle temp=null;
        for (int i = 0; i < ans.length-1; i++){
            for (int j = i+1 ; j < ans.length; j++){
                if (ans[j].getChargingTime() > ans[i].getChargingTime()){
                    temp = ans[j];
                    ans[j] = ans[i];
                    ans[i]= temp;
                }
            }
        }
        return ans;
    }
    /*
    Description

This method takes an array of ElectricVehicle objects.
It should return the ElectricVehicle object having the second highest price.
No two vehicles will have the same price.
If the array contains fewer than two vehicles, the method should return null.
    */
   public static ElectricVehicle findSecondCostliestVehicle(ElectricVehicle[] arr){
    ElectricVehicle first = null;
    ElectricVehicle second = null;

    for (ElectricVehicle e : arr){
        if (first== null || e.getPrice() > first.getPrice()){
            second = first;
            first = e;
        }else if(second == null || e.getPrice() > second.getPrice()){
            second = e;
        }
    }
    return second;
   }
}
