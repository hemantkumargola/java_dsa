// hierarchical inhertance 

class Animal {

  void eat() {
    System.out.println("Eating...");
  }
}

class Dog extends Animal {

  void bark() {
    System.out.println("Barking...");
  }
}

class Cat extends Animal {

  void meow() {
    System.out.println("Meowing...");
  }
}

public class oops16 {

  public static void main(String[] args) {

    Dog d = new Dog();
    d.eat(); // parent
    d.bark(); // child

    Cat c = new Cat();
    c.eat(); // parent
    c.meow(); // child
  }
}
