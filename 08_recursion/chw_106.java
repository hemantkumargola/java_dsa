public class  chw_106 {

    public static void main(String[] args) {

        int[] arr = {10, 5, 7, 8, 4, 5, 1, 87, 98, 4, 7, 8, 45};

        int target = 4;

        int ans = firstOccurrence(arr, 0, target);

        System.out.println(ans);
    }

    public static int firstOccurrence(int[] arr, int i, int target) {

        // Base Case
        if (i == arr.length) {
            return -1;
        }

        // Self Work
        if (arr[i] == target) {
            return i;
        }

        // Recursive Call
        return firstOccurrence(arr, i + 1, target);
    }
}