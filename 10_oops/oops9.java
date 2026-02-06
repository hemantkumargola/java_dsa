// multileve inheritanse 
class A {
  void diaplayA() {
    System.out.println("class A ");
  }
}

class B extends A {
  void diaplayB() {
    System.out.println("class B ");
  }
}

class C extends B {
  void diaplayC() {
    System.out.println("class c ");
  }
}

public class oops9 {

  public static void main(String[] args) {
    C obj = new C();
    obj.diaplayC();
    obj.diaplayB();
    obj.diaplayA();
  }
}
