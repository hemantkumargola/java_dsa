public class chw_103 {
  public static void main(String[] args) {
    int[] arr ={10,20,30,40,50,60,70,80,90,100};
    display(arr,0);
  }
  public static void display(int[] arr ,int idx){
    if(idx==arr.length){
      return ;
    }
    System.out.print(arr[idx]+" ");
    display(arr, idx+1);
  }
}
