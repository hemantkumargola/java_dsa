/**
 * chw_01
 */

// same basic program of hashset
import java.util.HashSet;
public class chw_01 {

public static void main (String[]args){
  
HashSet<Integer> set = new HashSet<Integer>();

set.add(10);
set.add(20);
set.add(30);
set.add(40);
System.out.println(set);
System.out.println(set.size());
System.out.println(set.contains(20));
System.out.println(set.isEmpty());
System.out.println(set.remove(30));
System.out.println(set);
Object[] arr = set.toArray();  // tarika one hai 
// Integer[] arr1 = new Integer[set.size()];  // tarika two hai
for(int i=0; i<set.size(); i++){
  System.out.print(arr[i]+ " ");
}
  
}}