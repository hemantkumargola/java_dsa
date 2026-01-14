// 
// Q12. Sort the array of 0’s , 1’s and 2’s . (Dutch Flag Algorithm)

public class chw_16 {

    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,0,2,2,2,0,0,1,1,0,1,2,0};
        int noz = 0;
        int noo = 0;
      int n = arr.length;

      for (int i = 0; i < n; i++) {
        if(arr[i] ==0) noz++;
        if(arr[i] == 1) noo++; 

      }
      for (int i = 0; i < n; i++) {
        if(i<noz) arr[i] = 0;
        else if (i<noz +noo) arr[i] =1;
        else arr[i] = 2;

        
      }
      for(int ele : arr){
        System.out.print(ele + " ");
      }
    }
}