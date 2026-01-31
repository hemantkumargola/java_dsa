// Pre In Post
public class chw_12 {
    public static void pri(int n){
        if(n==0) return;
        System.out.println("per "+n);
        pri(n-1);
        System.out.println("in  "+n);
        pri(n-1);
        System.out.println("post "+n);
    }

    public static void main(String[] args) {
        pri(3);
    }
}