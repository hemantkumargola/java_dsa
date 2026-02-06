abstract class car {
  abstract public void fule();

  public void colou() {
    System.out.println("red");
  }
}

class tata extends car {
  public void fule() {
    System.out.println("desal");
  }

}

public class oops22 {

  public static void main(String[] args) {
    tata obj = new tata();
    obj.colou();
    obj.fule();
  }
}