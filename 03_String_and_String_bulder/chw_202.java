// Q5 : Input a string and Update all the even positions in the
// string to character ‘a’. Consider 0-based indexing.
public class chw_202 {

    public static void main(String[] args) {
        String s = "hemant kumar gola";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if(i%2==0){
                str += 'a';
            }
            else{
             str+= s.charAt(i);
            }
          

            
        }
          System.out.println(str);
 
    }
}

// this proces is very poor 
