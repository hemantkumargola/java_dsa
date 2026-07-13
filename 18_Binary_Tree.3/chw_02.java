// Print elements of nth level
import java.util.Scanner;

class Node {
 int val;
 Node left;
 Node right;
 Node(int val){
  this.val = val;

 } 
}
public class chw_02 {
  static int n ;

  public static void main(String[] args) {
    Scanner  sc = new Scanner(System.in);

    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    Node e = new Node(5);
    Node f = new Node(6);
    Node g = new Node(7);


    a.left = b;
    a.right= c;
    b.left = d;
    b.right= e;
    c.left = f;
    c.right = g;
n = sc.nextInt();
nthlevel(a,0);

  }
  private static void nthlevel(Node root,int level){
    if(root== null) return;
    if(level==n)  System.out.print(root.val+ " ");
    nthlevel(root.left, level+1);
    nthlevel(root.right, level+1);

  }
  
}
