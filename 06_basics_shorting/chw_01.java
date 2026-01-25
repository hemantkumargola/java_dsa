//check the given is short ya unshort 
public class chw_01 {

    public static void main(String[] args) {
        // int[] arr = {1,4,8,2,7,3};
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        boolean flag = true;  // this means array short 
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]) {
              flag = false;
              break;

            }
            
        }
        if (flag==true) {
            System.out.println("shorted");
            
        }
        else{
            System.out.println("ubshorted");
        }
    }
}