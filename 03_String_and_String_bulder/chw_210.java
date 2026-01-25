// Q12 : Compress a given string.
public class chw_210 {
    public static void main(String[] args) {

        String s = "aaaagggggcccuvvvdhhh";
        char[] arr = s.toCharArray();

        String ans = "";
        int i = 0, j = 0;

        while (j < arr.length) {

            if (arr[j] == arr[i]) {
                j++;
            } else {
                ans += arr[i];
                int len = j - i;
                if (len > 1) ans += len;
                i = j;
            }
        }

        // last group handle
        ans += arr[i];
        int len = j - i;
        if (len > 1) ans += len;

        System.out.println(ans);
    }
}
