import java.util.HashMap;
public class chw_05 {
  public static void main(String[] args) {
    HashMap<String , Integer> map = new HashMap<>();
    map.put("one", 1);
    map.put("two", 2);  
    map.put("three", 3);
    map.put("four", 4); 
    map.put("five", 5);
  for(String key : map.keySet()){
    System.out.println("Key: " + key + ", Value: " + map.get(key));


  }
  System.out.println();
System.out.println();
for(int val :map.values()){
  System.out.println("Value: " + val);
}
System.out.println();
// maethods 3 
for(Object pair :map.entrySet()){
  System.out.println("Pair: " + pair);
}
  }
}