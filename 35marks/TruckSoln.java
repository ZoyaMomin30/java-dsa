/*
Build a console application to manage the driver and truck related data. Each truck will have exactly one driver who will drive the truck.
Create a class Truck with following attribute
id: integer
name: String
totalMilesTraveledByTruck: Float

Create a class Driver with following attribute
id: integer
name: String
contact: String
experience: Float

Establish the relationship between the Truck and Driver. Create getters, setters, and
parameterized constructors for the above classes.

Create class Solution with the main method.
Implement the below static method in Solution class

getAllTruckWithDistance method:
This method accepts an array of Truck objects and an integer value representing the
threshold distance as input parameters. It returns an array of Truck objects whose
total miles traveled is greater than or equal to the specified distance.

The resulting array must be sorted in descending order based on the associated
driver’s experience.
If no truck meets the specified distance criteria, the method should return null.
Note:
• A Truck must have exactly one associated Driver, and a driver cannot exist without
a Truck.
• If multiple drivers have the same experience value, the corresponding trucks
should be ordered according to the original insertion order in the input array.

Test Cases:

Sample input 1:

4
101
EcoHaul
2999.99
11
Arjun Nair
9876500101
3.0
102
CargoJet
3000
12
Priya S
9876500102
7.5
103
HighwayStar
4500.5
13
Rohit Menon
9876500103
5.25
104
MetroLink
3000.00
14
Nikita Rao
9876500104
9.0
3000


Sample output 1:
104

MetroLink
3000.0
14
Nikita Rao
102
CargoJet
3000.0
12
Priya S
103
HighwayStar
4500.5
13
Rohit Menon
--------------------------
Sample input 2:
0
100
Sample output 2:
No Truck Found

*/
import java.util.Arrays;
import java.util.Scanner;

class Driver{
    private int id;
    private String name;
    private String contact;
    private float experience;

    public Driver(int id, String name, String contact, float experience){
        this.id = id ;
        this.name=name;
        this.contact=contact;
        this.experience=experience;
    }
    //getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getContact(){
        return contact;
    }

    public float getExperience(){
        return experience;
    }

    //setters
    public void setId(int id){
        this.id = id ;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setContact(String contact){
        this.contact=contact;
    }
    public void setExperience(float experience){
        this.experience=experience;
    }
}

class Truck{
    private int id;
    private String name;
    private float totalMilesTraveledByTruck;
    private Driver driver;

    public Truck(int id, String name, float totalMilesTraveledByTruck, Driver driver){
        this.id = id;
        this.name=name;
        this.totalMilesTraveledByTruck=totalMilesTraveledByTruck;
        this.driver=driver;
    }

    //getters 
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public float getTotalMilesTraveledByTruck(){
        return totalMilesTraveledByTruck;
    }

    public Driver getDriver(){
        return driver;
    }

    //setters
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;

    }
    public void setTotalMilesTraveledByTruck(float totalMilesTraveledByTruck){
        this.totalMilesTraveledByTruck=totalMilesTraveledByTruck;
    }

    public void setDriver(Driver driver){
        this.driver=driver;
    }

}

public class TruckSoln {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Truck[] tarr = new Truck[n];

        for (int i = 0 ; i < n ; i++){
            int id = sc.nextInt(); sc.nextLine();
            String name=sc.nextLine();
            float totalMiles = sc.nextFloat();
            int did = sc.nextInt(); sc.nextLine();
            String dname =  sc.nextLine();
            String dcontact = sc.nextLine();
            float dexperience = sc.nextFloat(); sc.nextLine();

            Driver driver = new Driver(did, dname, dcontact, dexperience);
            tarr[i] = new Truck(id, name, totalMiles, driver);

        }
        int distance = sc.nextInt(); sc.nextLine();

        Truck[] ans = getAllTruckWithDistance(tarr,distance);

        System.out.println("\n");
        System.out.println("\n");

        if(ans == null){
            System.out.println("No Truck Found");
        }else{
            for(Truck t : ans){
                System.out.println(t.getId());
                System.out.println(t.getName());
                System.out.println(t.getTotalMilesTraveledByTruck());
                System.out.println(t.getDriver().getId());
                System.out.println(t.getDriver().getName());
            }
        }
        sc.close();
    }
    
    public static Truck[] getAllTruckWithDistance(Truck[] arr, int distance){
        Truck[] ans = new Truck[0];
        for (int i = 0; i < arr.length ; i++){
            if (arr[i].getTotalMilesTraveledByTruck() >= distance){
                 ans = Arrays.copyOf(ans,ans.length+1);
                 ans[ans.length-1] = arr[i];
        }
    }
    Truck temp;
        //sorting the drivers in descending order of their experience 
        for (int j = 0 ; j < ans.length-1 ; j++){

            for (int k = j+1; k<ans.length ; k++){
                if (ans[j].getDriver().getExperience() < ans[k].getDriver().getExperience()){
                    temp = ans[k];
                    ans[k] = ans[j];
                    ans[j] = temp;
                }
            }
        }
            if (ans.length == 0){
            return null;
            }
        return ans;
    }
}
