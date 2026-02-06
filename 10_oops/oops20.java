// polymorphism  also  overriding 

class Bank {
  void roi() {
    System.out.println("rate 5%");
  }
}

class Sbi extends Bank {
  void roi() {
    System.out.println("sbi rat 6%");
  }
}

class Hdfc extends Bank {
  void roi() {
    System.out.println("hdfc rate 7%");
  }
}

public class oops20 {

  public static void main(String[] args) {
    Bank obj = new Bank();
    Sbi obj2 = new Sbi();
    Hdfc obj3 = new Hdfc();
    obj.roi();
    obj2.roi();
    obj3.roi();
  }
}