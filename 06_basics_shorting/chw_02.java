// bultin short 

import java.lang.reflect.Array;
import java.util.Arrays;

public class chw_02 {

    public static void main(String[] args) {
        int[] arr =  {4,5,7,5,7,1,85,16,89};
         for(int ele : arr){
            System.out.print(ele+ " ");
         }
        System.out.println();

        Arrays.sort(arr);  // bult in methods 
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}