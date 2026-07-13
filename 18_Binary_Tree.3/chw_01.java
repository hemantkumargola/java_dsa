// Level order traversal (Using Queue)

import java.util.LinkedList;
import java.util.Queue;

class Node {
  int val;
  Node left;
  Node right;

  Node(int val) {
    this.val = val;

  }
}

public class chw_01 {
  public static void main(String[] args) {

    Node a = new Node(1);
    Node b = new Node(4);
    Node c = new Node(0);
    Node d = new Node(2);
    Node e = new Node(0);
    Node f = new Node(5);
    a.left = b;
    a.right = c;
    b.left = d;
    d.right = e;
    b.right = f;

levelorder(a);
  }
private static void levelorder(Node root){
  Queue<Node> q = new LinkedList<>();
  if(root!=null) q.add(root);
  while (q.size()>0) {
    Node front = q.remove();
    System.out.print(front.val+ " ");
    if(front.left!=null) q.add(front.left);
    if (front.right!=null) q.add(front.right);
    
  }
}

}