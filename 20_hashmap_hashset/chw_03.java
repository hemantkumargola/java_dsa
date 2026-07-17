import java.util.HashMap;

public class chw_03 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("three"));
        System.out.println(map.isEmpty());
        System.out.println(map.remove(3));
        System.out.println(map);
    }
}