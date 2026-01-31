// Subsets
// Print subsets of a string with unique characters.
// Follow Up : Do it for array as well

import java.util.ArrayList;

public class chw_16 {
    static ArrayList<String> arr = new ArrayList<>();
    public static void print(int i,String s ,String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        char  ch = s.charAt(i);
        
        print(i+1, s, ans+ch); // take element 
        print(i+1, s, ans);   // not take element 

    }

    public static void main(String[] args) {
        String s = "abc";
        arr = new ArrayList<>();   // reset 
       print(0,s,"");
       System.out.println(arr);

    }
}