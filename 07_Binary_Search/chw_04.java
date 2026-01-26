import java.util.ArrayList;
import java.util.List;

public class chw_04 {

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        int left = 0, right = arr.length - 1;

        // Step 1: Find closest index to x (Binary Search)
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // Step 2: Two pointers
        int l = left - 1;
        int r = left;

        // Step 3: Expand window using two pointers
        while (k > 0) {
            if (l < 0) {
                r++;
            } else if (r >= arr.length) {
                l--;
            } else if (Math.abs(arr[l] - x) <= Math.abs(arr[r] - x)) {
                l--;
            } else {
                r++;
            }
            k--;
        }

        // Step 4: Store result
        List<Integer> result = new ArrayList<>();
        for (int i = l + 1; i < r; i++) {
            result.add(arr[i]);
        }

        return result;
    }

    // 🔹 Main method (VS Code run ke liye)
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;

        List<Integer> ans = findClosestElements(arr, k, x);
        System.out.println(ans);
    }
}
