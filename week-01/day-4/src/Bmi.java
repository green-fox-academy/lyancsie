public class Bmi {
  public static void main(String[] args) {
    double massInKg = 77.0;
    double heightInM = 1.75;

    System.out.println("Your BMI index is: " + massInKg / (heightInM * heightInM));
  }
}