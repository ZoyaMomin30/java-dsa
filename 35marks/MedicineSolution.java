/*
Create class Medicine with below attributes: 

MedicineName - String 
batch - String 
disease - String 
price - int

Create class Solution and implement static method "getPriceByDisease" in the Solution class. 
This method will take array of Medicine objects and a disease String as parameters. 
And will return another sorted array of Integer objects where the disease String matches with the 
original array of Medicine object's disease attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects 
referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease" 
method and print the result.

Input
-------------

dolo650
FAC124W
fever
200
paracetamol
PAC545B
bodypain
150
almox
ALM747S
fever
100
aspirin
ASP849Q
flu
250
fever

Output
---------
100
200
*/
import java.util.*;

class Medicine{
    private String MedicineName;
    private String batch;
    private String disease;
    private int price;

    public Medicine(String MedicineName, String batch, String disease, int price){
        this.MedicineName = MedicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName(){
        return MedicineName;
    }

    public String getBatch(){
        return batch;
    }

    public String getDisease(){
        return disease;
    }
    public int getPrice(){
        return price;
    }

    
}
public class MedicineSolution{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Medicine[] arr = new Medicine[4];

        for(int i = 0; i < 4 ; i ++){
            String MedicineName = sc.nextLine();
            String disease = sc.nextLine();
            String batch = sc.nextLine();
            int price = sc.nextInt();
             sc.nextLine();

             arr[i] = new Medicine (MedicineName, disease, batch, price);

        }
        String searchDisease = sc.nextLine();
        int[] result = getPriceByDisease(arr, searchDisease);
        if (result.length == 0){
            System.out.println("no such disease");
        }else{
            for (int i = 0; i < result.length; i++){
                System.out.println(result[i]);
            }
        }

        sc.close();
    }
    /*
    Create class Solution and implement static method "getPriceByDisease" in the Solution class. 
    This method will take array of Medicine objects and a disease String as parameters. 
    And will return another sorted array of Integer objects where the disease String matches with the 
    original array of Medicine object's disease attribute (case insensitive search).
    */

    public static int[] getPriceByDisease(Medicine[] arr, String searchDisease){
        int[] result = new int[0];

        for (int i = 0; i < arr.length; i++){
            if(arr[i].getDisease().equalsIgnoreCase(searchDisease)){
                result = Arrays.copyOf(result , result.length+1);
                result[result.length-1] = arr[i].getPrice();
            }
        }
        Arrays.sort(result);
        return result;
    }
}