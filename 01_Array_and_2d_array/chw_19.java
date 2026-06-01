public class chw_19 {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 54, 65, 15, 45, 7};
        int n = arr.length;

        int[] nums = new int[n];
        nums[n - 1] = -1;

        for (int i = 0; i < n - 1; i++) {
            int mx = Integer.MIN_VALUE;

            for (int j = i + 1; j < n; j++) {
                mx = Math.max(mx, arr[j]);
            }

            nums[i] = mx;
        }

        for (int ele : nums) {
            System.out.print(ele + " ");
        }
    }
}