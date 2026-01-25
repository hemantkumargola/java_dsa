// Q1 : Given an array of marks of students, if the mark of any
// student is less than 35 print its roll number. [roll number
// here refers to the index of the array.

public class chw_04 {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<35){
                System.out.print(i + " ");
            }
        }
    }
}