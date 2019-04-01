public class Card {
  
  int value;
  String valueAsString;
  String colour;
  
  Card(String inputValueAsAString, String colour) {
    this.valueAsString = inputValueAsAString;
    this.value = valueToInt(inputValueAsAString);
    this.colour = colour;
  }
  
  int valueToInt(String inputValue) {
    if (inputValue.equals("A") || inputValue.equals("K") || inputValue.equals("Q") || inputValue.equals("J")) {
      
      if (inputValue.equals("A")) {
        this.value = 14;
      }
      if (inputValue.equals("K")) {
        this.value = 13;
      }
      if (inputValue.equals("Q")) {
        this.value = 12;
      }
      if (inputValue.equals("J")) {
        this.value = 11;
      }
    } else {
      value = Integer.parseInt(valueAsString);
    }
    return value;
  }
}