import java.util.HashMap;

public class chw_04 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // put() - Insert
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        System.out.println("Initial Map : " + map);

        // put() - Existing key ko update karta hai
        map.put(2, "TWO");
        System.out.println("After Updating Key 2 : " + map);

        // put() - New key add karta hai
        map.put(5, "five");
        System.out.println("After Adding Key 5 : " + map);

        System.out.println("Size : " + map.size());
        System.out.println("Contains Key 2 : " + map.containsKey(2));
        System.out.println("Contains Value 'three' : " + map.containsValue("three"));
        System.out.println("Is Empty : " + map.isEmpty());

        System.out.println("Removed Value : " + map.remove(3));
        System.out.println("Final Map : " + map);
    }
}