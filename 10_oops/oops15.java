// to invoke partent class controtor

class animals {
  animals() {
    System.out.println("animals creats");
  }
}

class Dog extends animals {
  Dog() {
    super();
    System.out.println("dog is creast ");
  }
}

public class oops15 {

  public static void main(String[] args) {
    Dog obj = new Dog();
  }
}