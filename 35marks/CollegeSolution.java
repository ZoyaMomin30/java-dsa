/*
Create a class College with the below attributes.

 id-int 
 name -String 
 contactNo-int
 address-String 
 pinCode-int

Write the getters and setters and parametrized constructor in the above 

mentioned sequence as required.
Create the class Solution with the main method.
Implement the two static methods:

 1.findCollegeWithMaximumPincode 

 2.searchCollegeByAddress

findCollegeWithMaximumPincode method:
   Create the Static method in the Solution Class.
 This method will take array of the College objects and return the 
College object having maximum pincode if found else return null if not found.

for this method ,main method will print College object with maximum
pincode if the returned value is not null.if the returned value is null ,
then the main method will print "No college found with mentioned attribute".

searchCollegeByAddress method:

   Create the Static method in the Solution Class. This method will take array of College objects as input and address as 
input and return College object having the mentioned address if found 
else return null if not found.
   for this method main method will print College object details as it is ,
 if the returned value is not null.if the returned value is null then ,
main method will print "No college found with mentioned attribute".

***************************************************************************

input 1:

4
109 
ACT
2500256
mumbai
695001
107
MCE
2500254
malapuram
612354
113
CTE
2500252
chennai
623145
102
SCT
2500255
AP
523641
AP

OUTPUT1:

id-109

name-ACT

contactNo-2500256

address-mumbai

pincode-695001

id-102

name-SCT

contactNo-2500255

address-AP

pincode-523641

INPUT2:

4
111
MJT
2500251
Calicut
401235
105
MET
2500256
kochi
668745
115
IIT
2500262
banglore
569874
110
ACT
2500263
delhi
687945
delhi

output2:

id-110

name-ACT

contactNo-2500263

address-delhi

pincode-687945

id-110

name-ACT

contactNo-2500263

address-delhi

pincode-687945
*/


import java.util.*;

class College{
   int id;
   String name;
   int contactNo;
   String address;
   int pinCode;

   public College(int id, String name, int contactNo, String address, int pinCode){
      this.id = id;
      this.name= name;
      this.contactNo = contactNo;
      this.address=address;
      this.pinCode=pinCode;
   }

   public int getId(){
      return id;
   }

   public String getName(){
      return name;
   }

   public int getContactNo(){
      return contactNo;
   }

   public String getAddress(){
      return address;
   }

   public int getPinCode(){
      return pinCode;
   }
}

public class CollegeSolution{

   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      College[] arr = new College[n];
      for(int i = 0; i < n; i ++){
         int id= sc.nextInt(); sc.nextLine();
         String name= sc.nextLine();
         int contactNo = sc.nextInt(); sc.nextLine();
         String address = sc.nextLine();
         int pinCode= sc.nextInt(); sc.nextLine();

         arr[i] = new College(id, name, contactNo, address, pinCode);
      }

      String searchAddress = sc.nextLine();
      College result =  findCollegeWithMaximumPincode(arr);
      if(result == null ){
         System.out.println("No college found with mentioned attribute");

      }else{
         System.out.println(
            "ID- "+ result.getId()+"\n" +
            "Name- "+ result.getName()+"\n" +
            "ContactNo- "+ result.getContactNo()+"\n" +
            "Address- "+ result.getAddress()+"\n" +
            "Pincode- "+ result.getPinCode()+"\n"
         );
      }
      System.out.println("2nd program");

      College addResult = searchCollegeByAddress(arr,searchAddress);
      if(addResult == null){
         System.out.println("No college found with mentioned attribute");
      }else{
         System.out.println(
            "ID - "+ addResult.getId() +
            "Name- "+ addResult.getName()+"\n" +
            "ContactNo- "+ addResult.getContactNo()+"\n" +
            "Address- "+ addResult.getAddress()+"\n" +
            "Pincode- "+ addResult.getPinCode()+"\n"
         );

      }

      sc.close();
   }
   /*
      Create the Static method in the Solution Class.
 This method will take array of the College objects and return the 
College object having maximum pincode if found else return null if not found.

for this method ,main method will print College object with maximum
pincode if the returned value is not null.if the returned value is null ,
then the main method will print "No college found with mentioned attribute".
   */

      public static College findCollegeWithMaximumPincode(College[] arr){
         College maxCollege = arr[0];

         for(int i = 1; i < arr.length; i++){

            if(arr[i].getPinCode() > maxCollege.getPinCode()){
                  maxCollege = arr[i];
            }
         }

         return maxCollege;
      }
/*
searchCollegeByAddress method:

   Create the Static method in the Solution Class. This method will take array of College objects as input and address as 
input and return College object having the mentioned address if found 
else return null if not found.
   for this method main method will print College object details as it is ,
 if the returned value is not null.if the returned value is null then ,
main method will print "No college found with mentioned attribute".
*/
   public static College searchCollegeByAddress(College[] arr, String searchAddress){
      College result = null;
      for(int i = 0; i < arr.length;i++){
         if(arr[i].getAddress().equalsIgnoreCase(searchAddress)){
            result = arr[i];
         }
      }
      return result;
   }

}