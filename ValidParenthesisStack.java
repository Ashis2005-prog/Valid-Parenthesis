import java.util.Stack;

public class ValidParenthesisStack {

    public static boolean isvalid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {// opening
                s.push(ch);
            } else {// closing
                if (s.isEmpty()) {
                    return true;
                }
                if ((s.peek() == '(' && ch == ')') || // ()
                        (s.peek() == '{' && ch == '}') || // {}
                        (s.peek() == '[' && ch == ']'))// []
                {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }

    // public boolean isValid(String str) {
    // Stack<Character> s = new Stack<>();
    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);
    // if(!s.isEmpty()){
    // char last=s.peek();
    // if ((last== '(' && ch == ')') || // ()
    // (last== '{' && ch == '}') || // {}
    // (last== '[' && ch == ']'))// []
    // {
    // s.pop();
    // continue;
    // }
    // }
    // s.push(ch);
    // }
    // return s.isEmpty();
    // }
    // }

    public static void main(String[] args) {
        String str = "(){[]}";
        System.out.println(isvalid(str));
    }
}
