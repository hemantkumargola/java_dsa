// print array  with help of recursion 
public class chw_13 {
    public static void print(int i ,int[] arr){
        if(i==arr.length) return ;
        System.out.print(arr[i]+ " ");
        print(i+1,arr);

    }

     public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,63};
        print(0,arr);
     }
}