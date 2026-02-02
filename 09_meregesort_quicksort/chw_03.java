public class chw_03 {

  static int count = 0;

  public static void mergeSort(int[] arr) {
    int n = arr.length;
    if (n <= 1)
      return;

    int mid = n / 2;

    int[] left = new int[mid];
    int[] right = new int[n - mid];

    for (int i = 0; i < mid; i++)
      left[i] = arr[i];

    for (int i = 0; i < n - mid; i++)
      right[i] = arr[mid + i];

    mergeSort(left);
    mergeSort(right);

    countInversion(left, right);
    merge(left, right, arr);
  }

  public static void countInversion(int[] a, int[] b) {
    int i = 0, j = 0;

    while (i < a.length && j < b.length) {
      if (a[i] > b[j]) {
        count += (a.length - i);
        j++;
      } else {
        i++;
      }
    }
  }

  public static void merge(int[] a, int[] b, int[] arr) {
    int i = 0, j = 0, k = 0;

    while (i < a.length && j < b.length) {
      if (a[i] <= b[j])
        arr[k++] = a[i++];
      else
        arr[k++] = b[j++];
    }

    while (i < a.length)
      arr[k++] = a[i++];
    while (j < b.length)
      arr[k++] = b[j++];
  }

  public static void main(String[] args) {
    int[] arr = { 54, 78, 98, 14, 2, 32, 15, 54, 45 };

    mergeSort(arr);

    for (int x : arr)
      System.out.print(x + " ");

    System.out.println("\nInversions = " + count);
  }
}
