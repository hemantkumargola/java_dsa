import java.util.ArrayList;

public class chw_108 {

    public static void main(String[] args) {

        int[] arr = {10, 5, 7, 8, 4, 5, 1, 87, 98, 4, 7, 8, 4};

        int target = 4;

        ArrayList<Integer> ans = allOccurrence(arr, 0, target);

        System.out.println(ans);
    }

    public static ArrayList<Integer> allOccurrence(int[] arr, int i, int target) {

        // Base Case
        if (i == arr.length) {
            return new ArrayList<>();
        }

        // Recursive Call
        ArrayList<Integer> list = allOccurrence(arr, i + 1, target);

        // Self Work
        if (arr[i] == target) {
            list.add(0, i);   // Add at beginning to keep indices in order
        }

        return list;
    }
}