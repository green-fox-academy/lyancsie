package GreenFox;

public class Student extends Person{
  String previousOrganization;
  int skippedDays;
  
  public String getGoal(){
    return "Be a junior software developer";
  }
  
  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }
  
  public Student() {
    name = "Pista Norbert";
    age = 23;
    gender = "undecided";
    previousOrganization = "FKF Zrt";
  }
  
  public String introduce(){
    return "Hi, I'm  "+ name  + " a " + age  + "year old " + gender + " from " + previousOrganization  + " who skipped skippedDays days from the course already.";
  }
  
  public void skipDays(int numberOfDays){
    skippedDays += numberOfDays;
  }
  
}
