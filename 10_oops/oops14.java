// to invoke parent  class methods 
// using super keywoard 
class a {
  void eat() {
    System.out.println("a is eat ");
  }

}

class b extends a {
  void eat() {
    System.out.println("b is eat ");
  }

  void bark() {
    System.out.println("b is bark ");
  }

  void work() {
    super.eat();
    bark();
  }
}

public class oops14 {

  public static void main(String[] args) {
    b obj = new b();
    obj.work();

  }
}