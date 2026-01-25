// Q4 : Calculate the sum of all the elements in the given
// array.


public class chw_05 {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,6,80,90,4};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println(" the sum  equal to "+ sum);
    }
}