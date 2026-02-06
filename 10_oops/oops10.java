// interface

interface Car {
  void show(); // only declaration (no body)
}

class Electric implements Car {
  public void show() {
    System.out.println("Electric car started");
  }
}

class Diesel implements Car {
  public void show() {
    System.out.println("Diesel car started");
  }
}

public class oops10 {

  public static void main(String[] args) {

    Car ele = new Electric();
    Car xuv = new Diesel();

    ele.show();
    xuv.show();
  }
}
