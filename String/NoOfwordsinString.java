import java.util.*;
public class NoOfwordsinString {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String new_str = str.trim();

        String[] arr = new_str.split("\\s+");
        System.out.println(arr.length);
        sc.close();
     }
    
}
