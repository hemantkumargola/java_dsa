// binary search question   //leetcode 704
public class chw_01 {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        int target = 30;
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        boolean flag = false;
        while (lo<=hi) {
            int mid = (lo+hi)/2;
            if(arr[mid] == target){
                flag = true;
                break;

            }
            else if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]<target) lo = mid+1;

            
        }
        if(flag==true){
            System.out.println("element found ");
        }
        else{
            System.out.println("not found");
        }
        }
}
