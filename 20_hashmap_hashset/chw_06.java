import java.util.*;

public class chw_06 {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(20);

        System.out.println(set);

        System.out.println(set.first());
        System.out.println(set.last());

        System.out.println(set.higher(20));
        System.out.println(set.lower(20));

        System.out.println(set.ceiling(25));
        System.out.println(set.floor(25));
    }
}