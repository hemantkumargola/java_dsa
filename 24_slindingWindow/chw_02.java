public class chw_02 {
  // exaple sliding window optimized code 
  public static void main(String[] args) {
    int[] arr = {10,20,1,3,-40,80,10};
    int maxsum = Integer.MIN_VALUE;
    int k =2;
    int n = arr.length;
    int i=0,j =k-1,sum =0;
    for(int a =0;a<=k-1;a++){
      sum += arr[a];

    }i++;j++;
    while (j<n) {
      sum = sum - arr[i-1]+arr[j];
      maxsum = Math.max(maxsum, sum); 
      i++;j++;
      
    
    }
    System.out.println(maxsum);
  }
  
}
