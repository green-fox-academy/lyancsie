package GreenFox;

public class Mentor extends Person {
  
  String level;
  
  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }
  
  public Mentor() {
    name = "Ferenc";
    age = 22;
    gender = "male";
    level = "senior";
  }
  
  public String getGoal() {
    return "Educate brilliant junior software developers.";
  }
  
  public String introduce() {
    return "Hi, I am " + name + " a " + age + " year old " + gender + level + " mentor";
  }
  
}
