// using super keywoard 
class a {
  String colour = "white";

}

class b extends a {
  String colour = "red";

  void printcolour() {
    System.out.println(colour);
    System.out.println(super.colour); // this is used the super keywoard

  }
}

public class oops13 {

  public static void main(String[] args) {
    b obj = new b();
    obj.printcolour();

  }
}