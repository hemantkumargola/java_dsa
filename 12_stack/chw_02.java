import java.util.Stack;

public class chw_02{
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        int n = stack.size();
        int[] arr = new int[n];

        // stack → array
        for (int i = n-1;i>=0;i--) {
            arr[i] = stack.pop();
        }

        // array → stack
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }

        System.out.println("Reversed Stack: " + stack);
    }
}
