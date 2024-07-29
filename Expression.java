import java.util.Scanner;

public class Expression {

    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the string
        System.out.print("Enter the string: ");

        // Read the input string from the user and trim any leading or trailing whitespace
        String input = scanner.nextLine().trim();

        // Close the Scanner object
        scanner.close();

        // Remove all whitespace within the input string
        input = input.replaceAll("\\s+", "");
        
        // Find the index of the opening parenthesis
        int openParenIndex = input.indexOf('(');
        if (openParenIndex == -1) {
            System.out.println("Invalid input format.");
            return;
        }
        // Extract the operation part of the input string
        String operation = input.substring(0, openParenIndex);

        // Find the index of the closing parenthesis
        int closeParenIndex = input.indexOf(')', openParenIndex);
        if (closeParenIndex == -1) {
            System.out.println("Invalid input format.");
            return;
        }
        // Extract the operands part of the input string
        String operandsPart = input.substring(openParenIndex + 1, closeParenIndex);

        // Find the index of the comma separating the operands
        int commaIndex = operandsPart.indexOf(',');

        if (commaIndex == -1) {
            System.out.println("Invalid input format.");
            return;
        }

        String operand1 = operandsPart.substring(0, commaIndex);
        String operand2 = operandsPart.substring(commaIndex + 1);

        int x1, x2;
        try {
            x1 = Integer.parseInt(operand1);
            x2 = Integer.parseInt(operand2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
            return;
        }

        int result = 0;
        // Perform the operation based on the extracted operation string
        switch (operation) {
            case "ADD":
                result = x1 + x2;
                break;
            case "SUB":
                result = x1 - x2;
                break;
            case "MUL":
                result = x1 * x2;
                break;
            case "DIV":
                if (x2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                result = x1 / x2;
                break;
            case "POW":
                result = (int) Math.pow(x1, x2);
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }
        // Print the result of the operation
        System.out.println("Output: " + result);
    }
}
