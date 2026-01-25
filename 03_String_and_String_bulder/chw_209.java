// Q11 : Given n string consisting of digits from 0 to 9. Return the string which has maximum value.
class chw_209{
    public static void main(String[] args) {

        String[] arr = {"00000645", "746745", "563540000000000", "0025"};

        String maxS = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxS = max(maxS, arr[i]);
        }

        System.out.println(maxS); // Output: 746745
    }

    // Function to return max numeric string
    public static String max(String a, String b) {

        String s = purify(a);
        String t = purify(b);

        // Compare length
        if (s.length() > t.length()) return a;
        if (s.length() < t.length()) return b;

        // Compare digit by digit
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return (s.charAt(i) > t.charAt(i)) ? a : b;
            }
        }

        return a; // equal case
    }

    // Remove leading zeros
    public static String purify(String s) {
        int i = 0;
        while (i < s.length() - 1 && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i);
    }
}
