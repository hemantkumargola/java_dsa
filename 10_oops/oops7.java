// parameteized constructor 

class Student {

  int marks;

  // Parameterized Constructor
  Student(int m) {
    marks = m;
  }

  void show() {
    System.out.println(marks);
  }
}

public class oops7 {
  public static void main(String[] args) {
    Student s = new Student(90);
    s.show();
  }
}
