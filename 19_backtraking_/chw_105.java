// recusion se abc print 

import java.util.ArrayList;
import java.util.List;

/**
 * chw_105
 */
public class chw_105 {
public static void print(String str ,String t ,List<String> l){
  if(str.equals("")){
    l.add(t);
    return;
  }
  for(int i =0;i<str.length();i++){
    char ch = str.charAt(i);
    String lef = str.substring(0, i);
    String rig = str.substring(i+1);
    String rem = lef +rig;
    print(rem, t+ch,l);
  }
}
  public static void main(String[] args) {
  String  str  = "abc";
  List<String> l = new ArrayList<>();
  print(str,"",l);
  for(int i =0;i< l.size();i++){
    System.out.println(l.get(i));
  }
  }
}