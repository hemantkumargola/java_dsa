class student {
  private String name;
  private int age;
  private int roll;

  public String getname() {
    return name;
  }

  public int getAge() {
    return age;

  }

  public int getroll() {
    return roll;
  }

  public void setname(String name) {
    this.name = name;
  }

  public void setage(int age) {
    this.age = age;
  }

  public void setroll(int roll) {
    this.roll = roll;
  }

}

public class oops21 {

  public static void main(String[] args) {
    student obj = new student();
    obj.setname("hemant kumar gola");
    obj.setage(20);
    obj.setroll(44);
    System.out.println(obj.getname());
    System.out.println(obj.getAge());
    System.out.println(obj.getroll());
  }
}