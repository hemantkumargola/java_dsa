import java.util.HashSet;

public class chw_02 {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50 };
    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();
    HashSet<Integer> set = new HashSet<Integer>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    for (int ele : set) {
      System.out.print(ele + " ");  // hash map me simpler element ex hi  bar ha sakata hai delete element vo hi ho jata jai 
    }
    System.out.println();

  }
}
  