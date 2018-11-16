public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long

    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    int NumberOfWeeks = 17;
    int WorkDaysPerWeek = 5;
    int CodingPerDay = 6;
    System.out.println("Average coded hours: " + (NumberOfWeeks * WorkDaysPerWeek * CodingPerDay));
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52

    float WorkingHoursPerWeek = 52;
    float HoursPerWeek = 168;
    System.out.println("Proportion of coded hours during the session: " + (WorkingHoursPerWeek / HoursPerWeek) * 100 + "%");
  }
}