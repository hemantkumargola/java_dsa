// find the max  value in  java 

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
      this.val = val;
    }
  }
public class chw_02 {


  public static void main(String[] args) {
    Node a = new Node(1);
    Node b = new Node(4);
    Node c = new Node(10);
    Node d = new Node(2);
    Node e = new Node(54);
    Node f = new Node(5);
   a.left = b;  a.right = c;
   b.left = d; d.right = e;
   b.right = f;
  System.out.println( maxs(a));

  }
private static int  maxs(Node root){
  if(root == null) return Integer.MIN_VALUE;
  return Math.max(root.val,Math.max(maxs(root.left), maxs(root.right)));
}
}