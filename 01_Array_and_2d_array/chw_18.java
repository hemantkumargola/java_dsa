// Q13. Merge two sorted arrays .
public class chw_18 {

    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70,80,90,100};
        int[] b = {5,15,25,35,45,55,65,75,85,95,105};
        int[] c = new int[a.length+b.length];
        int i = 0, j = 0, k =0;
        //merging short 
        while (i<a.length && j<b.length) {
            if(a[i]<=b[j]){
                c[k] =a[i];
                i++;

            }
            else{
                c[k] =b[j];
                j++;

            }
            k++;

        
        }
        if(i==a.length){
            while (j<b.length) {
                c[k] = b[j];
                j++;k++;
                
            }

        }
         if(j==b.length){
            while (i<a.length) {
                c[k] = a[i];
                i++;k++;
                
            }
            
        }
        for(int ele : c){
            System.out.print(ele + " ");

        }

    }
}