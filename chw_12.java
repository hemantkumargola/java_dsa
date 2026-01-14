// Q8 : Find the doublet in the Array whose sum is equal to the
// given value x. (Two Sum)

public class chw_12 {

    public static void main(String[] args) {
        int[] arr = {1,8,7,98,4,5,6,2,0,9};
        int x = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] +arr[j] == x){
                    System.out.println(arr[i] + " " + arr[j]) ;
                }

            }
        }
    }
}