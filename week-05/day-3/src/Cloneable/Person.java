package Cloneable;

public class Person {
  
  String name;
  int age;
  String gender;
  
  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    
  }
  
  public Person(){
    name = "Kukoricza Lyanos";
    age = 32;
    gender = "male";
  }
  
  public String introduce() {
    return "Hi, my name is " + name + " " + age + " " + gender;
  }
  
  public String getGoal() {
    return "My goal is: Live for the moment!";
  }
  
}
