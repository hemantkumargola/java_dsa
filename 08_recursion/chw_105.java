public class chw_105 {
  public static void main(String[] args) {
    int[] arr = {10,5,7,8,4,5,01,87,98,4,7,8,45};
    int l = maxs(arr,0);
    
    System.out.println(l);

  }
    public static int maxs(int[] arr ,int i){
      if(i == arr.length){
        return  Integer.MIN_VALUE;

      }
  int mas = maxs(arr, i+1);
    return  Math.max(arr[i], mas);

    }

}
