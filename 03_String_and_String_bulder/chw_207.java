// string short 

import java.lang.reflect.Array;
import java.util.Arrays;

public class chw_207 {

    public static void main(String[] args) {
        String s = "hemantkumatrgola";
        char[] ch = s.toCharArray();  // same =tostring().tocharArray()  stringbulder me bhi hota hai 
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
       Arrays.sort(ch);
       for(char ele : ch){
       System.out.print(ele);
       }
       System.out.println();
    

    }
    
}