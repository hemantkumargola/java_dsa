class Ciecularqueue {
  int[] arr;
  int f;
  int r;
  int size;

  Ciecularqueue(int len) {
    arr = new int[len];

  }

  // add function
  void add(int val) {
    if (size == arr.length) {
      System.out.println("arr is full ");
      return;
    }
    arr[r++] = val;
    if (r == arr.length)
      r = 0;
    size++;
  }

  // removed ka liye function
  int removed() {
    if (size == 0) {
      System.out.println("quueu id empty");
      return -1;
    }
    int forntval = arr[f];
    f++;
    if (f == arr.length)
      f = 0;
    size--;
    return forntval;
  }

  // peeek value
  int peek() {
    if (size == 0) {
      System.out.println("queue is empty ");
      return -1;

    }
    return arr[f];
  }
//void display
  void diaplay(){
    if(size==0) return;
    if(f>=r){
      for(int i =f;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
      }
      for(int i =0;i<r;i++){
        System.out.print(arr[i] + " ");
      }

    }
    else{
      for(int i =f;i<r;i++){
        System.out.print(arr[i]+ " ");
      }
    }
    System.out.println();
  }
}

public class chw_06 {

  public static void main(String[] args) {
    Ciecularqueue qu = new Ciecularqueue(5);
    qu.add(10);
    qu.add(20);
    qu.add(30);
    qu.add(40);
    qu.diaplay();
    System.out.println(qu.removed());
    qu.diaplay();
    System.out.println(qu.peek());
    qu.diaplay();
    qu.add(30);
    qu.add(60);
    
    qu.diaplay();

   

  }
}