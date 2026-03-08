// Binary Tree Level Order Traversal

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}

public class chw_02 {

    static class Pair {
        Node node;
        int level;

        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.left = b; 
        a.right = c;

        b.left = d; 
        b.right = e;

        c.right = f;

        levelorder(a);
    }

    private static void levelorder(Node root){

        int prevLevel = 0;
        Queue<Pair> q = new LinkedList<>();

        if(root != null) q.add(new Pair(root,0));

        while(q.size() > 0){

            Pair front = q.remove();

            Node temp = front.node;
            int lvl = front.level;

            if(lvl != prevLevel){
                System.out.println();
                prevLevel = lvl;
            }

            System.out.print(temp.val + " ");

            if(temp.left != null) q.add(new Pair(temp.left, lvl+1));
            if(temp.right != null) q.add(new Pair(temp.right, lvl+1));
        }

        System.out.println();
    }
}