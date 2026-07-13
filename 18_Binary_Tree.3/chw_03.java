// Level order traversal without (Using Queue)
import java.util.Scanner;

class Node {
 int val;
 Node left;
 Node right;
 Node(int val){
  this.val = val;

 } 
}
public class chw_03 {
  static int y ;

  public static void main(String[] args) {
    Scanner  sc = new Scanner(System.in);

    Node a = new Node(1);
Node b = new Node(2);
Node c = new Node(3);
Node d = new Node(4);
Node e = new Node(5);
Node f = new Node(6);
Node g = new Node(7);
Node h = new Node(8);
Node i = new Node(9);
Node j = new Node(10);
Node k = new Node(11);
Node l = new Node(12);
Node m = new Node(13);
Node n = new Node(14);
Node o = new Node(15);

// Level 1
a.left = b;
a.right = c;

// Level 2
b.left = d;
b.right = e;
c.left = f;
c.right = g;

// Level 3
d.left = h;
d.right = i;

e.left = j;
e.right = k;

f.left = l;
f.right = m;

g.left = n;
g.right = o;

for(int z = 0;z<=3;z++){
  y = z;
  nthlevel(a,0);
  System.out.println();
}


  }
  private static void nthlevel(Node root,int level){
    if(root== null) return;
    if(level==y)  System.out.print(root.val+ " ");
    nthlevel(root.left, level+1);
    nthlevel(root.right, level+1);

  }
  
}
