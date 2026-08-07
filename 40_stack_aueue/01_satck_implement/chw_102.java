class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {

    Node top;

    // Push
    public void push(int data) {

        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
    }

    // Pop
    public int pop() {

        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;
        top = top.next;

        return value;
    }

    // Peek
    public int peek() {

        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    // Size
    public int size() {

        int count = 0;
        Node temp = top;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Display
    public void display() {
// linked list impletation    
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class chw_102 {

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.print("Stack: ");
        st.display();

        System.out.println("Top: " + st.peek());

        System.out.println("Popped: " + st.pop());

        System.out.print("After Pop: ");
        st.display();

        System.out.println("Size: " + st.size());
    }
}