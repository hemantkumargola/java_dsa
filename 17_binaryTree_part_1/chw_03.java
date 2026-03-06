public class chw_03 {

  public static void main(String[] args) {
    TNOde a = new TNOde(1);
    TNOde b = new TNOde(2);
    TNOde c = new TNOde(3);
    TNOde d = new TNOde(4);
    TNOde e = new TNOde(5);
    TNOde f = new TNOde(6);
    TNOde g = new TNOde(7);
    a.left = b; a.right = c;
    b.left = d; b.right = e;
    c.left = f; c.right = g;
    System.out.print("pre : ");
  pre(a) ;
  System.out.println();
  System.out.print("inoder: ");
  inorder(a);
  System.out.println();
  System.out.print("post : ");
  post(a);
  }
  //  pre order
  private static void pre(TNOde root){
    if(root== null) return;
    System.out.print(root.val + " ");
    pre(root.left);
    pre(root.right);
  }

  // inorder 
       private static void inorder(TNOde root){
    if(root== null) return;

    inorder(root.left);
       System.out.print(root.val + " ");
    inorder(root.right);
  
  }
  // post order 
    private static void post(TNOde root){
    if(root== null) return;

    post(root.left);
    post(root.right);
     System.out.print(root.val + " ");
  }


}