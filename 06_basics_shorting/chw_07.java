// seclection sort example 
public class chw_07 {
public static void print(int[] arr ){
    for(int ele : arr){
        System.out.print(ele + " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
         int[] arr = {10,2,8,7,81,0,5,0};
         int n = arr.length;
         for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < n; j++) {
                if(arr[j]<min){
                min =arr[j];
                mindx = j;
                
                
            }}
              int temp = arr[i];
        arr[i] = arr[mindx];
        arr[mindx] = temp;
    }
          
        //  swap
      print(arr);
}
}