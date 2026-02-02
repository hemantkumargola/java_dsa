// merge sort used 
public class chw_02 {
  public static void print(int[] arr) {
    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }

  public static void mereges(int[] a, int[] b, int[] c) {
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

  public static void meregeshort(int[] arr) {
    int n = arr.length;
    if (n == 1)
      return;
    // creat two array n/2 size
    int[] a = new int[n / 2];
    int[] b = new int[n - n / 2];
    // copy past
    for (int i = 0; i < n / 2; i++) {
      a[i] = arr[i];

    }
    for (int i = 0; i < n - n / 2; i++) {
      b[i] = arr[i + n / 2];

    }
    meregeshort(a);
    meregeshort(b);
    mereges(a, b, arr);

  }

  public static void main(String[] args) {
    int[] arr = { 54, 78, 98, 14, 02, 32, 15, 54, 45 };
    print(arr);
    meregeshort(arr);
    print(arr);
  }
}