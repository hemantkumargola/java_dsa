// methods overriding 
class Animal {

  void sound() {
    System.out.println("Animal sound");
  }
}

class Dog extends Animal {

  @Override
  void sound() {
    System.out.println("Dog barks");
  }
}

public class oops18 {

  public static void main(String[] args) {

    Dog a = new Dog(); // parent reference

    a.sound(); // child method called
  }
}
