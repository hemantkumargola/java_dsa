public class chw_102 {
  public static void main(String[] args) {
    ziz(100);
  }
  public static void ziz(int n ){
    if(n==0) return;
    System.out.println("pre  "+ n);
    ziz(n-1);
    System.out.println("in   "+ n);
    ziz(n-1);
    System.out.println("post "+ n);
    
  }
}
