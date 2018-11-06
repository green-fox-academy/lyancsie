import java.util.Scanner;
public class Calculator {
    public static void main(String... args) {
        System.out.println(calculate());
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
    }
    public static int calculate(){
        Scanner read = new Scanner(System.in);
        int result = 0;
        String operation = new String();
        while ( (!operation.equals("*")) && (!operation.equals("+")) && (!operation.equals("-")) && (!operation.equals("/")) && (!operation.equals("%"))){
            System.out.println("Gimmie the values: ");
            operation = read.next();
            int operand1 = read.nextInt();
            int operand2 = read.nextInt();
            if (operation.equals("*")) {
                result = operand1 * operand2;
            }
            if (operation.equals("+")) {
                result = operand1 + operand2;
            }
            if (operation.equals("-")) {
                result = operand1 - operand2;
            }
            if (operation.equals("/")) {
                result = operand1 / operand2;
            }
            if (operation.equals("%")) {
                result = operand1 % operand2;
            }
        }
        return result;
    }
}
