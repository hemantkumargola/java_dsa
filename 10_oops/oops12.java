// more exampe

interface A {
  void show();
}

interface B {
  void display();
}

class C implements A, B {

  public void show() {
    System.out.println("Show method");
  }

  public void display() {
    System.out.println("Display method");
  }
}

public class oops12 {
  public static void main(String[] args) {

    C obj = new C();
    obj.show();
    obj.display();
  }
}
