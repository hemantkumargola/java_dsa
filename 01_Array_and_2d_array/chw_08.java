// 

public class chw_08 {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,500,60,70,8000,90};
        int n  = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            if(arr[i] >mx)  mx = arr[i];
            
        }
        System.out.println(mx);
// second mx number 
int smx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(mx !=arr[i]){
              if(arr[i] >smx) smx=arr[i];
            }

        
            
        }
        System.out.println(smx);


    }
}