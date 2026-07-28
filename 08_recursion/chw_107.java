public class chw_107{

    public static void main(String[] args) {

        int[] arr = {10, 5, 7, 8, 4, 5, 1, 87, 98, 4, 7, 8, 45};

        int target = 4;

        int ans = lastOccurrence(arr, 0, target);

        System.out.println(ans);
    }

    public static int lastOccurrence(int[] arr, int i, int target) {

        // Base Case
        if (i == arr.length) {
            return -1;
        }

        // Recursive Call
        int index = lastOccurrence(arr, i + 1, target);

        // If found later, return that index
        if (index != -1) {
            return index;
        }

        // Otherwise check current index
        if (arr[i] == target) {
            return i;
        }

        return -1;
    }
}