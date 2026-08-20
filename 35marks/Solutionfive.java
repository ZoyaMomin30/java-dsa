/*
Question:
Create class Movie with below attributes: 

movieName - String 
company - String 
genre - String 
budget - int

Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will 
take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie 
objects where the searchGenre String matches with the original array of Movie object's genre attribute 
(case insensitive search).

Write necessary getters and setters.

Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the 
attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else 
print "Low Budget Movie".

Input
---------
aaa
Marvel
Action
250000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action

Output
-------------------
High Budget Movie
High Budget Movie
*/
import java.util.*;

class Movie{
    String movieName;
    String company;
    String genre;
    int budget;

    public String getMovieName(){
        return movieName;
    }

    public String getCompany(){
        return company;
    }

    public String getGenre(){
        return genre;
    }

    public int getBudget(){
        return budget;
    }

    public Movie(String movieName,String company, String genre, int budget){
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

}
public class Solutionfive{
    public static void main (String[] args){

        //create movie array 
        Movie[] arr = new Movie[4];

        //create scanner object 
        Scanner sc = new Scanner(System.in);

        //take input
        for (int i = 0; i < 4; i++){
            String movieName = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt(); sc.nextLine();
            
            //store in array
            arr[i] = new Movie(movieName,company,genre,budget);

        }
        String searchGenre = sc.nextLine();
        Movie[] answer = getMovieByGenre(arr,searchGenre);
        for (int i = 0; i < answer.length; i ++){   
        if (answer[i].getBudget() > 80000000){
            System.out.println("High Budget Movie");
        }else{
            System.out.println("Low budget Movie");
        }
        }
        sc.close();
    }
    //copyOf
    //Creates a new array of the specified size.
    // Copies all old elements.
    // Returns the new array.
    //result
    // +------+
    // | aaa  |
    // +------+
    //initially :
    // result = []
    // length = 0

    public static Movie[] getMovieByGenre(Movie[] arr, String searchGenre){
        Movie result[] = new Movie[0];
        for (int i = 0; i <arr.length ; i++){
            if (arr[i].getGenre().equalsIgnoreCase(searchGenre)){
                
                //"Create a new array that is 1 element larger than the current array and copy all existing movies into it."
                result = Arrays.copyOf(result, result.length+1);
                
                // "Put the newly found matching movie in the last empty position."
                result[result.length - 1] = arr[i];
            }
        }
        return result;
    }
}