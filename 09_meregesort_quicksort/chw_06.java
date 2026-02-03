public class chw_06 {

  // swap
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // print
  public static void print(int[] arr) {
    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }

  // partition
  public static int partition(int[] arr, int lo, int hi) {

    int pivot = arr[lo];
    int count = 0;

    // count smaller
    for (int i = lo + 1; i <= hi; i++) {
      if (arr[i] <= pivot)
        count++;
    }

    int correctIdx = lo + count;

    swap(arr, lo, correctIdx);

    int i = lo, j = hi;

    while (i < correctIdx && j > correctIdx) {

      if (arr[i] <= pivot)
        i++;
      else if (arr[j] > pivot)
        j--;
      else {
        swap(arr, i, j);
        i++;
        j--;
      }
    }

    return correctIdx;
  }

  // quicksort
  public static void quicksort(int[] arr, int lo, int hi) {
    if (lo >= hi)
      return;

    int idx = partition(arr, lo, hi);

    quicksort(arr, lo, idx - 1);
    quicksort(arr, idx + 1, hi);
  }

  // ==============================
  // kth largest (SIMPLE METHOD)
  // ==============================
  public static int kthLargest(int[] arr, int k) {

    quicksort(arr, 0, arr.length - 1);

    return arr[arr.length - k];
  }

  // main
  public static void main(String[] args) {

    int[] arr = { 4, 5, 1, 7, 2, 9, 7, 6, 2, 6 };

    System.out.println("Before Sorting:");
    print(arr);

    int k = 3;

    int ans = kthLargest(arr, k);

    System.out.println("After Sorting:");
    print(arr);

    System.out.println(k + "th largest element = " + ans);
  }
}
