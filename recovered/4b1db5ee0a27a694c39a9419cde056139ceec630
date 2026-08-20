import java.util.*;
public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean answer = isValid(str);
        System.out.println(answer);
        sc.close();
    }

    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '{' || c == '[') {//if opening bracket 
                st.push(c);
            } 
            else if (c == ')' || c == '}' || c == ']') {//closing bracket

                if (st.isEmpty()) { //stack is empty and only bracket is left.
                    return false;
                }

                char top = st.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return st.isEmpty();
    }
}