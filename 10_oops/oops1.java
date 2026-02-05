public class oops1 {

  String name;
  int roll;

  void print() {
    System.out.println(name);
    System.out.println(roll);
  }

  public static void main(String[] args) {
    oops1 s = new oops1();
    s.name = "hemant";
    s.roll = 20;
    s.print();

    oops1 sc = new oops1();
    sc.name = "kunal";
    sc.roll = 50;

    sc.print();

  }
}