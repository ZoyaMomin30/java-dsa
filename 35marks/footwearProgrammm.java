/*
create a class Footwear which consists of the below attributes.
  footwearId=int
  footwearName=String
  footwearType=String
  price =int

the above attributes should be private.
write getter and setter and parametrised constructor as required.

create the class footwearProgrammm with the main method.
implement the 2 static methods.getCountByType and
getSecondHighestPriceByBrand in the Solution class.

getCountByType method:
this method will take two input parameters. array of the Footwear objects and string parameter footwear type. this method will return the count of the footwears from array of the footwear objects for the given type of footwear. if no footwear with the given footwear type is found in the array of footwear abjects,then the method should return 0.

getSecondHighestPriceByBrand method:
this method will take 2 input parameters-array of footwear objects and string parameter inputFootwearName.the method
will return the second highest footwear objects based on the price from the array of the Footwear objects

whose brand name matches with the input string parameter.

if no footwear with the given brand is present in the array of the footwear objects,the the method
should return null.

NOTE: no two footwear objects would have the same footwearId.All the searches should be case insensitive.
the above mentioned static methods should be called from the main method.

for getCountByType method- the main method should print the count of the footwears ,if the returned value
is greater than zero. or it should print "Footwear not available";

for getSecondHighestPriceByBrand method-The main method should print price from the returned footwear objects


if the returned footwear object is not null.else it should print "Brand not available".
for example.
112
ABC
25555
  where 112 is the footwear id,ABC is brand name,25555 is price.

consider the sample input and output.
100
Sketchers
sneekers
12345
103
Puma
running shoes
10099
102
reebok
Running shoes
5667
101
Reebok
running shoes
5656
99
reebok
floaters
5666
Running shoes
reebok

Sample output:
3
99
reebok
5666

Sample input2:

100
Puma
sneekers
12345
101
Puma
sneekers
10099
102
Puma
sneekers
5000
102
Reebok
sneekers
8000
104
Puma
floaters
2000
running shoes
bata

Sample output:
Footwear not available
Brand not available
*/

import java.util.*;

class Footwear{
  //   footwearId=int
  // footwearName=String
  // footwearType=String
  // price =int

   private int footwearId;
   private String footwearName;
   private String footwearType;
   private int price;

   public int getFootwearId(){
    return footwearId;
   }

   public String getFootwearName(){
    return footwearName;
   }

   public String getFootwearType(){
    return footwearType;
   }

   public int getPrice(){
    return price;
   }

   public Footwear(int footwearId, String footwearName, String footwearType, int price){
    this.footwearId = footwearId;
    this.footwearName = footwearName;
    this.footwearType = footwearType;
    this.price = price;
   }

}

public class footwearProgrammm{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    Footwear[] arr = new Footwear[5];

    for (int i = 0; i < 5; i++){
      int footwearId = sc.nextInt(); sc.nextLine();
      String footwearName = sc.nextLine();
      String footwearType= sc.nextLine();
      int price = sc.nextInt();
      sc.nextLine();

      arr[i] = new Footwear(footwearId, footwearName, footwearType, price);
    }
    String searchType = sc.nextLine();
    String inputFootwearName = sc.nextLine();

    System.out.println("Sample output: ");

    int noOfType = getCountByType(arr,searchType);
    if(noOfType == 0){
      System.out.println("Brand not available");
    }else {
      System.out.println(noOfType);
    }
    

    Footwear result = getSecondHighestPriceByBrand(arr,inputFootwearName);

    if (result == null){
      System.out.println("Footwear not available");

    }else{
          System.out.println(result.getFootwearId());
    System.out.println(result.getFootwearName());
    System.out.println(result.getFootwearType());
    }



    sc.close();

  }

  /*
  getCountByType method:
this method will take two input parameters. array of the Footwear objects and string parameter footwear type. this method will return the count of the footwears from array of the footwear objects for the given type of footwear. if no footwear with the given footwear type is found in the array of footwear abjects,then the method should return 0.

  */
  public static int getCountByType(Footwear[] arr, String searchType){
    int count=0;
    for (int i = 0; i <arr.length; i++){
      if(arr[i].getFootwearType().equalsIgnoreCase(searchType)){
        count++;
      }
    }
    return count;
  }
  /*
  getSecondHighestPriceByBrand method:
this method will take 2 input parameters-array of footwear objects and string parameter inputFootwearName.the method
will return the second highest footwear objects based on the price from the array of the Footwear objects
  */

  public static Footwear getSecondHighestPriceByBrand(Footwear[] arr, String inputFootwearName){
    Footwear highest = null;
    Footwear secondHighest = null;

    for (int i = 0; i < arr.length; i++){
      if(arr[i].getFootwearName().equalsIgnoreCase(inputFootwearName)){

    // If the current footwear has a price greater than the current highest:
    // The old highest becomes the secondHighest.
    // The current footwear becomes the new highest.
        if (highest == null || arr[i].getPrice() > highest.getPrice() ){
          secondHighest = highest;
          highest = arr[i];
        }else if (secondHighest == null || arr[i].getPrice() > secondHighest.getPrice()){
          secondHighest = arr[i];
        }
      }
    }
    return secondHighest;
  }
}