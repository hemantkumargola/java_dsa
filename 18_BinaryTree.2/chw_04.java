// find the tree   size 
class Node{
  int val;
  Node left;
  Node right;
  Node(int val){
    this.val = val;

  }
}
public class chw_04 {
  public static void main(String[] args) {

       Node a = new Node(1);
    Node b = new Node(4);
    Node c = new Node(0);
    Node d = new Node(2);
    Node e = new Node(0);
    Node f = new Node(5);
   a.left = b;  a.right = c;
   b.left = d; d.right = e;
   b.right = f;
  
   System.out.println(size(a));
   System.out.println(level(a));
  }
  private static int size(Node root){
    if(root == null) return 0;
    return 1+ size(root.left)+size(root.right);
  }

  // find the level 
  private static int level(Node root){
    if(root==null) return 0;
    return 1+ Math.max(level(root.left), level(root.right));
  }
}
