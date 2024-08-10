import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class eem514_2201722_03a {
    // Function to read the file content
    private static String readFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    // Function to check if parentheses and braces are balanced
    private static boolean Balanced(String content) {
        Stack<Character> stack = new Stack<>();
        for (char c : content.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return false;  // Extra closing brace/parenthesis
                }
                char last = stack.pop();
                if (!isMatchingPair(last, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();  // True if all opened are closed properly
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '{' && close == '}') ||
               (open == '(' && close == ')') ||
               (open == '[' && close == ']');
    }

    // Function to count the number of classes
    private static int countClasses(String content) {
        int count = 0;
        String[] tokens = content.split("\\s+");  // Split by whitespace
        for (String token : tokens) {
            if (token.equals("class")) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java eem514_2201757_03a <source-file>");
            return;
        }

        String fileName = args[0];
        System.out.println("Reading file: " + fileName);  // Debug print
        try {
            String fileContent = readFile(fileName);

            if (!Balanced(fileContent)) {
                System.out.println("Error: Unbalanced parentheses or braces");
                return;
            }

            int classCount = countClasses(fileContent);
            System.out.println(classCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    }