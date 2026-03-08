import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TNOde{
  int val;
  TNOde left;
  TNOde right; 
  TNOde (int val){
    this.val = val;
  }
}

public class chw_01 {
static int n ;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  TNOde a = new TNOde(1);
  TNOde b = new TNOde(2);
  TNOde c = new TNOde(3);
  TNOde d = new TNOde(4);
  TNOde e = new TNOde(5);
   TNOde f = new TNOde(6);

a.left =b ;  a.right= c;
b.left = d; b.right = e;
c.right = f;
leveorder(a);
System.out.println();
System.out.println("enetr the n ");
n = sc.nextInt();
nthlevel(a,0);


  }
//print the level traversal;
  private static void leveorder(TNOde root){
    Queue<TNOde>  q=  new LinkedList<>();
      if(root!=null) q.add(root);
      while (q.size()>0) {
        TNOde front = q.remove();
        System.out.print(front.val+ " ");
        if(front.left!=null) q.add(front.left);
        if(front.right!=null) q.add(front.right);
        
      }
      System.out.println();
    
  
}

// nth leve print 
 private static void nthlevel(TNOde root ,int level){
  if(root==null) return;
  if(level==n ) System.out.print(root.val+ " ");
  nthlevel(root.left, level+1);
  nthlevel(root.right, level+1);

}
}