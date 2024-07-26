import java.util.Scanner;

public class Expression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine().trim();

        input = input.replaceAll("\\s+", "");

        int openParenIndex = input.indexOf('(');
        if (openParenIndex == -1) {
            System.out.println("Invalid input format.");
            return;
        }

        String operation = input.substring(0, openParenIndex);

        int closeParenIndex = input.indexOf(')', openParenIndex);
        if (closeParenIndex == -1) {
            System.out.println("Invalid input format.");
            return;
        }

        String operandsPart = input.substring(openParenIndex + 1, closeParenIndex);
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

        System.out.println("Output: " + result);
    }
}
