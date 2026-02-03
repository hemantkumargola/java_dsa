public class chw_05 {

  // swap function
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // print array
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

    // count smaller elements
    for (int i = lo + 1; i <= hi; i++) {
      if (arr[i] <= pivot)
        count++;
    }

    int correctIdx = lo + count;

    // place pivot at correct position
    swap(arr, lo, correctIdx);

    int i = lo, j = hi;

    // rearrange
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

  // quick sort
  public static void quicksort(int[] arr, int lo, int hi) {
    if (lo >= hi)
      return;

    int idx = partition(arr, lo, hi);

    quicksort(arr, lo, idx - 1);
    quicksort(arr, idx + 1, hi);
  }

  public static void main(String[] args) {

    int[] arr = { 4, 5, 1, 7, 2, 9, 7, 6, 2, 6 };

    System.out.println("Before Sorting:");
    print(arr);

    quicksort(arr, 0, arr.length - 1);

    System.out.println("After Sorting:");
    print(arr);
  }
}
