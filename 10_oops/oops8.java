// basics example inhetritanse ;
// this example of single inhertance 

class parerntclass {
  void display() {
    System.out.println("this is parent class ");
  }
}

class child extends parerntclass {
  void show() {
    System.out.println("this is chile class ");
  }
}

public class oops8 {

  public static void main(String[] args) {
    child obj = new child();
    obj.display();
    System.out.println();
    obj.show();
  }
}