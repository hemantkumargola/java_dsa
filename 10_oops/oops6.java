// defalt constructor 
class Student {

  int marks;

  // Default Constructor
  Student() {
    marks = 50;
  }

  void show() {
    System.out.println(marks);
  }
}

public class oops6 {
  public static void main(String[] args) {
    Student s = new Student();
    s.show();
  }
}
