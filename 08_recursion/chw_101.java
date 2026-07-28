public class chw_101 {
  public static void main(String[] args) {
    int n =5;
    int x = 3;
    System.out.println(  pow(n,x));
  }
  public static int pow(int n , int x){
    if(x==0) return 1;
    int p =  n *pow(n,x-1);
    return  p;
  }
}
