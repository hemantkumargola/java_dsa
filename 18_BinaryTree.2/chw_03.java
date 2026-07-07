// find the minmum 
// find the manimun value in  java 

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
      this.val = val;
    }
  }
public class chw_03 {


  public static void main(String[] args) {
    Node a = new Node(1);
    Node b = new Node(4);
    Node c = new Node(10);
    Node d = new Node(2);
    Node e = new Node(-98);
    Node f = new Node(5);
   a.left = b;  a.right = c;
   b.left = d; d.right = e;
   b.right = f;
  System.out.println( mins(a));

  }
private static int  mins(Node root){
  if(root == null) return Integer.MAX_VALUE;
  return Math.min(root.val,Math.min(mins(root.left), mins(root.right)));
}
}