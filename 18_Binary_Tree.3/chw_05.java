// Preorder, Inorder and Postorder Traversal (Iterative)

import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class chw_05 {

    // Preorder Traversal (Root -> Left -> Right)
    public static void preorder(Node root) {
        if (root == null) return;

        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            Node curr = st.pop();
            System.out.print(curr.val + " ");

            if (curr.right != null)
                st.push(curr.right);

            if (curr.left != null)
                st.push(curr.left);
        }
    }

    // Inorder Traversal (Left -> Root -> Right)
    public static void inorder(Node root) {
        Stack<Node> st = new Stack<>();
        Node curr = root;

        while (curr != null || !st.isEmpty()) {

            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            System.out.print(curr.val + " ");

            curr = curr.right;
        }
    }

    // Postorder Traversal (Left -> Right -> Root)
    public static void postorder(Node root) {
        if (root == null) return;

        Stack<Node> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        st.push(root);

        while (!st.isEmpty()) {
            Node curr = st.pop();
            ans.add(curr.val);

            // Left first, then Right
            if (curr.left != null)
                st.push(curr.left);

            if (curr.right != null)
                st.push(curr.right);
        }
//reverse
Collections.reverse(ans);

System.out.println(ans);
    }

    public static void main(String[] args) {

        // Creating Tree
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        System.out.print("Preorder  : ");
        preorder(a);

        System.out.println();

        System.out.print("Inorder   : ");
        inorder(a);

        System.out.println();

        System.out.print("Postorder : ");
        postorder(a);
    }
}