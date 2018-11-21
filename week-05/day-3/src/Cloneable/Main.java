package Cloneable;

public class Main {
  

  public static void main(String[] args) throws CloneNotSupportedException {
    Student student = new Student("Ferenc", 25, "male","Xy.Kft" );
    Student student2 = (Student) student.clone();
    System.out.println(student2.introduce());
  }
}
