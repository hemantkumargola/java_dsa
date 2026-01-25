
// exdample basic bubble short    more example 
public class chw_04 {
public static void print(int[] arr ){
    for(int ele : arr){
        System.out.print(ele + " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int[] arr = {7,8,1,744,1,5,1,4,1,52,510,99,782,165,47,144,0,4,2,65,6,4,41,741,0,4,};
        int n = arr.length;
        print(arr);
        for (int x = 0; x < n-1; x++) {
            
        
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]  = arr[i+1];
                arr[i+1] = temp;
              
            }
            
        }
    }
        print(arr);

    }
}