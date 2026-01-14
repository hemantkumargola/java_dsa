// Q11. Sort the array of 0’s and 1’s .

public class chw_15 {

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,1,1,0,0,0,1,1,1,1,0,0,0};
        int n = arr.length;
        int i = 0; 
        int j = n-1;
        while (i<j) {
            if(arr[i] == 0) i++;
            if(arr[j] == 1 ) j--;
            if(i>j) break;
            if(arr[i]==1 && arr[j] ==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
            
        }
    
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}