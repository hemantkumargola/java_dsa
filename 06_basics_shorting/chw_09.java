// Q9 : Given an array with N distinct elements, convert the
// given array to a form where all elements are in the range
// from 0 to N-1. The order of elements is the same, i.e., 0 is
// placed in the place of the smallest element, 1 is placed for
// the second smallest element, ... N-1 is placed for the largest
// element.


public class chw_09 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {98,45,74,2,1,36};
        int n = arr.length;
        print(arr);
        int x = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for (int j = 0; j < n; j++) {
                if(arr[j]<min  && arr[j]>0){
                    min = arr[j];
                    mindex = j;
                }
                
            }
            arr[mindex] = x;
            x--;

        }
        print(arr);
        for (int i = 0; i < n; i++) {
            arr[i] *= (-1);
        }
        print(arr);
    }
}