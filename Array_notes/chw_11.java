//arraylist basic opration 

import java.util.ArrayList;

public class chw_11 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.err.println();

        // modify
        arr.set(2,500);
for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
System.err.println();
        arr.add(600);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }


    }
}