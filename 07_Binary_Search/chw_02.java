// Q2 : Given a sorted integer array and an integer ‘x’, find the
// lower bound of x.
public class chw_02 {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,45,60,65,69,70,80,90};
        int n = arr.length;
        int lb = n;
        int target = 50;

        int lo = 0;
        int hi = n-1;
        while (lo<=hi) {
            int mid = lo +(hi-lo)/2;
            if(arr[mid]>=target){
                lb = Math.min(lb,mid);
                hi = mid-1;

            }
            else{
                lo = mid +1;

            }

            
        }
        System.out.println(lb);
    }
}