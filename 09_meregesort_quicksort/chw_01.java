// merege two shorted array 
public class chw_01 {
  public static void print(int[] arr) {

    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }

  public static void margge(int[] a, int[] b, int[] c) {
    int i = 0, j = 0, k = 0;
    while (i < a.length && j < b.length) {
      if (a[i] < b[j])
        c[k++] = a[i++];
      else
        c[k++] = b[j++];

    }
    while (j < b.length) {
      c[k++] = b[j++];

    }
    while (i < a.length) {
      c[k++] = a[i++];

    }
  }

  public static void main(String[] args) {
    int[] a = { 10, 20, 30, 40, 50, 60, 70 };
    int[] b = { 5, 15, 25, 35, 45, 65, 75, 85, 95 };
    print(a);
    print(b);
    int[] c = new int[a.length + b.length];
    margge(a, b, c);
    print(c);
  }
}