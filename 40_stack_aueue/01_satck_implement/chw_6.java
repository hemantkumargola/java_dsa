import java.util.Stack;

public class chw_6{

    static void display(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int top = st.pop();
        display(st);          // Recursive call
        System.out.print(top + " ");
        st.push(top);         // Stack restore
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        display(st);

        System.out.println();
        System.out.println(st);
    }
}