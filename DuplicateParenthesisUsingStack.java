import java.util.Stack;

public class DuplicateParenthesisUsingStack {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int counter = 0;
                while (s.pop() != '(') {
                    counter++;
                }
                if (counter < 1) {
                    return true;
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+b)+(c+d)))";
        System.out.println(isDuplicate(str));
    }
}
