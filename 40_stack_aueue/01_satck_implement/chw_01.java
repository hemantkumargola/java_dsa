class Stack {
// array implemtationn 
    int[] arr = new int[5];
    int top = -1;
// push 
    public void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = data;
    }
// pop()
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }
// peek()
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    // Size Method
    public int size() {
        return top + 1;
    }


    // display methods 
    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class chw_01 {
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("Size: " + st.size());

        st.pop();

        st.display();

        System.out.println("Size: " + st.size());
    }
}