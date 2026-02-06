// interface 
interface Shape {
  void area();
}

class Circle implements Shape {
  public void area() {
    int r = 5;
    System.out.println("Area of Circle = " + (3.14 * r * r));
  }
}

class Rectangle implements Shape {
  public void area() {
    int l = 4, b = 6;
    System.out.println("Area of Rectangle = " + (l * b));
  }
}

public class oops11 {
  public static void main(String[] args) {

    Shape s1 = new Circle();
    Shape s2 = new Rectangle();

    s1.area();
    s2.area();
  }
}
