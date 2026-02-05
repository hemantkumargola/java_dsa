// java class methods 

class Dog {
  String name;

  void eat() {
    System.out.println(name + "  eats");
  }

}

public class oops3 {

  public static void main(String[] args) {
    Dog s = new Dog();
    s.name = "tommy";
    s.eat();
  }
}
