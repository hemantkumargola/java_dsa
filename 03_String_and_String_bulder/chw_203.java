// stringbulder
public class chw_203 {

    public static void main(String[] args) {
        String s = "";
        StringBuilder  str = new StringBuilder("abdc");
        System.out.println(str.length());
        System.out.println(str.capacity());  // capacity by defaul 16 hoti hai 
    
        StringBuilder n = new StringBuilder(10);
        System.out.println(n.length());
        System.out.println(n.capacity());   // dete hai to voi ho jata hi hai  
    }
}