public class chw_104 {
  public static void main(String[] args) {
    int[] arr ={10,20,30,40,50,60,70,80,90,100};
    display(arr,0);
    System.out.println();
    dis2(arr,arr.length-1);
  }
  public static void display(int[] arr ,int idx){
    if(idx==arr.length){
      return ;
    }
    display(arr, idx+1);
        System.out.print(arr[idx]+" ");

  }




    public static void dis2(int[] arr ,int idx){
    if(idx<0){
      return ;
    }
    
        System.out.print(arr[idx]+" ");
        dis2(arr, idx-1);

  }
}
