// initializtion of 2d array 
public class chw_203 {

    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4},{5,6},{7,8}};
        // for each methods se print 
        for(int[] ele :a){
            for(int x : ele ){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}