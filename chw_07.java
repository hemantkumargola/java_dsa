// Q6 : Find the maximum value out of all the elements in the
// array.

public class chw_07 {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,8000,90};
        int n  = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            if(arr[i] >mx)  mx = arr[i];
            
        }
        System.out.println(mx);
    }
}