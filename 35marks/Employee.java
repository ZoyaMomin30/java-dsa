/*
Create a class called Employee with the below attributes:

employeeld - int
name - String
branch - String
rating - double
company Transport - boolean
The above attributes should be private. write getters, setters and parameterized constructor as required.

Create class MyClass with main method.
Implement two static methods findCountOfEmployeesUsingCompTransport and findEmployeeWithSecondHighestRating
in MyClass class.

findCountOfEmployeesUsingCompTransport method: 
----------------------------------------------
This method will take an array of Employee object and a String parameter as input parameters. 
This method will calculate and return the count of Employees who are all using company transport 
in the given branch (String parameter passed).
If no Employee in the given branch using company transport in the array of Employee objects, then 
the method should return 0.

findEmployeeWithSecondHighestRating method: 
--------------------------------------------
This method will take an array of Employee objects as an input parameter. This method will return 
the object of the second highest rating employee from the array of Employee objects who are not using 
company transport.
If all Employees using company transport in the array of Employee objects, then the method should return null.

Note: All the searches should be case sensitive, companyTransport and rating combination of each Employee 
is unique.
For findCountOfEmployeesUsingCompTransport method, The main method should print the returned count as it 
is if the returned value is greater than 0, else it should print "No such Employees".
Ex: 2 , where 2 is the count
For findEmployeeWithSecondHighestRating method: The main method should print the employeeld and name from 
the returned object if the returned value is not null. If the returned value is null, then it should 
print "All Employees using company transport".
Ex: 1003
    Uma
where 1003 is the employeeld and Uma is the name.
Before calling these static methods in main, use Scanner object to read the values of four Employee 
objects referring attributes in the above mentioned attributes sequence. Next, read the value of String
parameter for capturing branch.

Input : 

1001
Ashwa
IT
5
true
1002
Preeti
IT
4
true
1003
Uma
Admin
3
false
1004
Akash
Hardware
4.5
false
IT


Output : 

2
1003
Uma
*/
import java.util.Scanner;

class EmployeeStruct {
    int employeeld;
    String name;
    String branch;
    double rating;
    boolean companyTransport;


public EmployeeStruct( int employeeld, String name, String branch, double rating, boolean companyTransport){
    this.employeeld=employeeld;
    this.name = name;
    this.branch=branch;
    this.rating=rating;
    this.companyTransport=companyTransport;
}

    //getter
    public int getEmployeeId(){
        return employeeld;
    }

    public String getName(){
        return name;
    }

    public String getBranch(){
        return branch;
    }

    public double getRating(){
        return rating;
    }

    public boolean getCompanyTransport(){
        return companyTransport;
    }

    
}

public class Employee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //creation of array 
        EmployeeStruct[] arr = new EmployeeStruct[4];
        for (int i = 0; i<4 ; i++){
            //take input 
            int employeeId= sc.nextInt(); sc.nextLine();
            String name= sc.nextLine();
            String branch =  sc.nextLine();
            double rating = sc.nextDouble(); sc.nextLine();
            boolean companyTransport = sc.nextBoolean();sc.nextLine();

            //store in array 
            arr[i] = new EmployeeStruct(employeeId, name, branch, rating, companyTransport);
        
        }
        String searchBranch = sc.nextLine();
        System.out.println("Answers");
        int ans = findCountOfEmployeesUsingCompTransport(arr,searchBranch);
        System.out.println(ans);

        EmployeeStruct result = findEmployeeWithSecondHighestRating(arr);
        System.out.println(result.getEmployeeId());
        System.out.println(result.getName());

        sc.close();

    }
    /*
    findCountOfEmployeesUsingCompTransport method: 
----------------------------------------------
This method will take an array of Employee object and a String parameter as input parameters. 
This method will calculate and return the count of Employees who are all using company transport 
in the given branch (String parameter passed).
If no Employee in the given branch using company transport in the array of Employee objects, then 
the method should return 0.
    */

    public static int findCountOfEmployeesUsingCompTransport(EmployeeStruct[] arr,String searchBranch){
        int count = 0;
        for (EmployeeStruct e : arr){
            if (e.getBranch().equalsIgnoreCase(searchBranch) && e.getCompanyTransport() == true){
                    count = count + 1;
            }
        }
        if(count>0)
        {
            return count;
        }
        else{
            return 0;
        }
    }
    /*
    findEmployeeWithSecondHighestRating method: 
--------------------------------------------
This method will take an array of Employee objects as an input parameter. This method will return 
the object of the second highest rating employee from the array of Employee objects who are not using 
company transport.
If all Employees using company transport in the array of Employee objects, then the method should return null.
    */

    public static EmployeeStruct findEmployeeWithSecondHighestRating(EmployeeStruct[] arr){
        EmployeeStruct first = null;
        EmployeeStruct second = null;

        for (EmployeeStruct e : arr){
            if (first == null || e.getRating() > first.getRating()){
                second = first;
                first = e;
            }

            else if ( second == null || e.getRating() > second.getRating()){
                second = e; 
            }
            
        }
        return second;

    }

}
