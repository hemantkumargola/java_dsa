public class chw_20 {
  public static void main(String[] args) {
        int[] arr = {8, 9, 1, 54, 65, 15, 45, 7};
        int n = arr.length;
          int[] nums = new int[n];
        nums[n - 1] = -1;
        int neg  = arr[n-1];
        for(int i =n-2;i>=0;i--){
          nums[i] = neg;
          neg = Math.max(neg, arr[i]);
        }
        for(int ele: nums){
          System.out.print(ele+ " ");
        }
  }
}
