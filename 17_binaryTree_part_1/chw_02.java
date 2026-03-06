public class chw_02 {

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

System.out.println(max(a));
System.out.println(size(a));
System.out.println("level is : " +  level(a));

}

//find the level 
private static int level(TNOde root){
  if(root == null ) return 0;
  return 1+ Math.max(level(root.left), level(root.right ));
}
// max val 
private static int max(TNOde root){
  if(root==null) return Integer.MIN_VALUE;
  int a = root.val;
  int b = max(root.left);
  int c = max(root.right);
  return Math.max(a, Math.max(b, c));

}

// size 
    private static int size(TNOde root){
    if(root==null) return 0;
    return 1+ size(root.left) + size(root.right);
  }

}