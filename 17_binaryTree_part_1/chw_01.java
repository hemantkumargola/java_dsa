class TNOde{
  int val;
  TNOde left;
  TNOde right; 
  TNOde (int val){
    this.val = val;
  }
}

public class chw_01 {

  public static void main(String[] args) {
  TNOde a = new TNOde(1);
  TNOde b = new TNOde(2);
  TNOde c = new TNOde(3);
  TNOde d = new TNOde(4);
  TNOde e = new TNOde(5);
   TNOde f = new TNOde(6);

a.left =b ;  a.right= c;
b.left = d; b.right = e;
c.right = f;
// System.out.println(b.val);
// System.out.println(a.left.val);
// System.out.println(e.val);
// System.out.println(a.left.right.val);


diaplay(a);
System.out.println();
System.out.println(sum(a));

System.out.println(produt(a));
  }
  // sum 
  private static int sum(TNOde root){
    if(root==null) return 0;
    return root.val + sum(root.left) + sum(root.right);
  }
  // product
    private static int produt(TNOde root){
    if(root==null) return 1;
    return root.val * produt(root.left) * produt(root.right);
  }

// this is display function 
  private static void diaplay(TNOde root){
    if(root== null) return;
    System.out.print(root.val + " ");
    diaplay(root.left);
    diaplay(root.right);
  }
}