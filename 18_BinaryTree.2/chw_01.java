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
   a.left = b;  a.right = c;
   b.left = d; d.right = e;
   b.right = f;

   System.out.println(a.val);
   System.out.println(a.left.val);
   System.out.println(a.left.left.right.val);
   System.out.println("display");
   display(a);
   System.out.println();
   System.out.println("sum "+ sum(a) );
   System.out.println("product "+ product(a) );
  }
  private static void display(Node root){
    if(root==null) return;  // base case 
    System.out.print(root.val+ " ");
    display(root.left);
    display(root.right);

  }
  private static int sum(Node root){
    if(root== null) return 0;
    return root.val + sum(root.left) + sum(root.right);

  }
    private static int product(Node root){
    if(root== null ||root.val ==0) return 1;
    return root.val * product(root.left) * product(root.right);

  }
} 