// pre in post order methods 
class Node {
  int val;
  Node left;
  Node right;

  Node(int val) {
    this.val = val;

  }
}

public class chw_05 {
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
pre(a);
System.out.println();

in(a);
System.out.println();
post(a);
  }

  private static void pre(Node root) {
    if (root == null)
      return;
    System.out.print(root.val + " ");
    pre(root.left);
    pre(root.right);
  }

  private      void post(Node root) {
    if (root == null)
      return;
   
    post(root.left);

    post(root.right);
    System.out.print(root.val + " ");

  }

  private static void in(Node root) {
    if (root == null)
      return;

    in(root.left);
    System.out.print(root.val + " ");
    in(root.right);

  }
}
