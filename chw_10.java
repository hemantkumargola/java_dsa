//  copy of array 

import java.util.Arrays;

public class chw_10 {

    public static void main(String[] args) {
        int[] arr = {30,40,50,60,70,80,60};
        for(int x : arr){
            System.out.print(x + " ");
        }
System.out.println();

// shallow copy
        // int [] nums = arr;  // shallow copy 
        // nums[0] = 70; 
        // System.out.println(arr[0]);




        //deep copy 
        int[]  brr = Arrays.copyOf(arr, arr.length);
        brr[0] =20;
        System.out.println(arr[0]);

        // second methods od deep copy
        int[] crr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            crr[i] = arr[i];
}
crr[0] =100;
System.out.println(arr[0]);

    }

}