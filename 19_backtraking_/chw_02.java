public class chw_02 {
public static void fintsub(String str ,String ans , int i){
  if(i==str.length()){
    System.out.println(ans);
    return;
  }
  // yesh case 
  fintsub(str, ans+str.charAt(i), i+1);

  // no case 
  fintsub(str, ans, i+1);
}
  public static void main(String[] args) {
    String str = "abc";
    fintsub(str, "",0);
    
  }
}