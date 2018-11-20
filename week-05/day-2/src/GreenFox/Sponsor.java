package GreenFox;

public class Sponsor extends Person {
  
  String company;
  int hiredStudents;
  
  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company=company;
  }
  
  public Sponsor(){
  name = "Xyz";
  age = 22;
  gender = "female";
  }
  
  public String introduce() {
    return "Hi, I'm  " + name + " a " + age + "year old " + gender + " who represents " + company + " and hired " + hiredStudents + " so far";
  }
  
  public void hire() {
    hiredStudents++;
  }
  
  public String getGoal() {
    return "Hire brilliant junior student developers";
  }
}
