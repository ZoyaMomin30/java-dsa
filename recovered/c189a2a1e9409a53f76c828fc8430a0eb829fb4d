// aabbbcc = a2b3c2
// abbccc = a1b2c3

import java.util.*;

public class CharRepeat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0 ; i < str.length() ; i ++ ){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) +1);
        }

        for (char key : map.keySet()){
            System.out.print(key+""+map.get(key));
        }
        sc.close();
    } 
}

