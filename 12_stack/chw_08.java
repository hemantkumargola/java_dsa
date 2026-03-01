import java.util.Stack;

public class chw_08 {

    public static void main(String[] args) {

        String s = "{[()]}";

        System.out.println(isCheck(s));
    }

    static boolean isCheck(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // opening brackets
            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            }
            // closing brackets
            else {

                if (st.isEmpty()) return false;

                char top = st.peek();

                if (sameStyle(top, ch)) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    static boolean sameStyle(char a, char b) {

        if (a == '(' && b == ')') return true;
        if (a == '{' && b == '}') return true;
        if (a == '[' && b == ']') return true;

        return false;
    }
}