public class chw_01 {
  // example of slinding window   this is brothforse 
  public static void main(String[] args) {
    int[] arr = {98,74,54,12,45,65,45,12};
    int maxsum = Integer.MIN_VALUE;
    int k =3;
    int n = arr.length;
    for(int i =0;i<n-k+1;i++){
      int sum =0;
      for(int j =i;j<i+k-1;j++){
        sum +=arr[j];
      
      }
       maxsum = Math.max(maxsum, sum);
    }
    System.out.println(maxsum);
  }
  
}
